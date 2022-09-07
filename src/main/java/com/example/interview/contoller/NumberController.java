package com.example.interview.contoller;

import com.example.interview.exception.CustomExceptions;
import com.example.interview.service.NumberService;
import com.example.interview.service.NumberServiceImp;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Tag(name ="number controller")
public class NumberController {
@Autowired
NumberService numberService;
    @Operation(summary = "calculate matching numbers from array of numbers")
    @GetMapping("/checknumber")
    public ResponseEntity receiveNumbers(@RequestParam Integer sum,@RequestParam int[] numbers){
        if(numbers==null ||numbers.length==0){
            throw new CustomExceptions("your list can't be empty");
        }

        return numberService.receiveNumbers(sum,numbers);
    }
}
