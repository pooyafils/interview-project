package com.example.interview.service;

import org.json.JSONObject;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class NumberServiceImp implements NumberService {
    public ResponseEntity receiveNumbers( Integer sum,  int[] numbers){
        ArrayList<int[]> arrayList=new ArrayList<>();
        for(int i=0;i<numbers.length;i++){

            for(int j=i+1;j<numbers.length;j++){
                if(numbers[i]+numbers[j]==sum){
                    int [] numbersEqualToSum={numbers[j],numbers[i]};
                    arrayList.add(numbersEqualToSum);
                }
            }
        }
        if(arrayList.size()==0){
            JSONObject zeroMatch = new JSONObject();
            zeroMatch.put("message", "there is no numbers that can match the sum number");
            zeroMatch.put("code",404);
            return new ResponseEntity(zeroMatch.toMap(), HttpStatus.valueOf(404));
        }
        return new ResponseEntity(arrayList, HttpStatus.valueOf(200));
    }
}
