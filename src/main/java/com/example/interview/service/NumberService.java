package com.example.interview.service;

import org.springframework.http.ResponseEntity;

public interface NumberService {
    public ResponseEntity receiveNumbers(Integer sum, int[] numbers);
}
