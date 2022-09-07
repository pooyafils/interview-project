package com.example.interview.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

@Service
public class NumberService {
    public ArrayList<int[]>  receiveNumbers( Integer sum,  int[] numbers){
        ArrayList<int[]> arrayList=new ArrayList<>();
        for(int i=0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==sum){
                    System.out.println(numbers[i]+"-------"+numbers[j]);
                    int [] numbersEqualToSum={numbers[j],numbers[i]};
                    arrayList.add(numbersEqualToSum);
                }
            }
        }
        System.out.println(arrayList);
        return arrayList;
    }
}
