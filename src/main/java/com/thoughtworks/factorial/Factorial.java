package com.thoughtworks.factorial;

import java.util.IllegalFormatCodePointException;

public class Factorial {
    public Integer compute(int i) throws IllegalArgumentException{
        if(i<0){
            throw new IllegalArgumentException("input was negative, expected a positive number");
        }
        if (i==0){
            return 1;
        }else {
            return i*compute(i-1);
        }
    }
}
