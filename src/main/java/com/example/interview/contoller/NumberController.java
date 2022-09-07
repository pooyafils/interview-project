package com.example.interview.contoller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {


    @GetMapping("/checknumber")
    public ResponseEntity receiveNumbers(@RequestParam int sum,@RequestParam int[] numbers){
        System.out.println(numbers.length);
        return ResponseEntity.ok("ok");
    }
}
