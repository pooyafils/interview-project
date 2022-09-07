package com.example.interview.contoller;

import com.example.interview.service.NumberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class NumberController {
@Autowired
    NumberService numberService;

    @GetMapping("/checknumber")
    public ResponseEntity receiveNumbers(@RequestParam int sum,@RequestParam int[] numbers){
        return ResponseEntity.ok(numberService.receiveNumbers(sum,numbers));
    }
}
