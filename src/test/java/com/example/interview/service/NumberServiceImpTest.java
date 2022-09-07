package com.example.interview.service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@SpringBootTest(classes = NumberServiceImp.class)
public class NumberServiceImpTest {

    @Autowired
    NumberService numberService;
    @ParameterizedTest
    @MethodSource("wordsWithLength")
    public void  receiveNumbers( Integer sum,  int[] numbers){
       // sum=4;
       // numbers= new int[]{2, 3, 4, 5, 0, 6, 1};
        ResponseEntity response=numberService.receiveNumbers(sum, numbers);
        response.getStatusCode();
        assertEquals(200,200);

    }
    private static Stream wordsWithLength() {
      int  sum=4;
        int[]    numbers= new int[]{2, 3, 4, 5, 0, 6, 1};
        return Stream.of(
                Arguments.of("sum", sum),
                Arguments.of("numbers", numbers));
    }
}
