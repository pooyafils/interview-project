package com.example.interview.exception;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.context.request.WebRequest;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

@ControllerAdvice
public  class GlobalExceptionHandler {
    @ExceptionHandler
    public ResponseEntity<ErrorHandling> productException(CustomExceptions customExceptions) {
        ErrorHandling errorHandling = new ErrorHandling();
        errorHandling.setStatus(HttpStatus.NOT_FOUND.value());
        errorHandling.setError(customExceptions.getMessage());
        //errorHandling.setTimestames(System.currentTimeMillis());
        return new ResponseEntity<>(errorHandling, HttpStatus.BAD_REQUEST);
    }
    @ExceptionHandler(RuntimeException.class)
    @ResponseStatus(HttpStatus.INTERNAL_SERVER_ERROR)
    public ResponseEntity<Object> handleAllUncaughtException(
            RuntimeException exception,
            WebRequest request
    ){
        return  ResponseEntity.ok("request can't be accpeted");
    }

    @ExceptionHandler(value = Exception.class)
    public ResponseEntity handelExceptions(HttpServletRequest request, Exception exception) {



        if (exception instanceof RuntimeException) {
            JSONObject internalError = new JSONObject();
            internalError.put("message", "internal error happened");
            internalError.put("code",400);
            return new ResponseEntity(internalError.toMap(), HttpStatus.valueOf(500));
        }
        JSONObject badRequest = new JSONObject();
        badRequest.put("message", "bad request or null input");
        badRequest.put("code",400);
        return new ResponseEntity(badRequest.toMap(), HttpStatus.valueOf(400));


    }

}


