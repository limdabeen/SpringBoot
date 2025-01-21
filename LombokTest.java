package com.example.demo;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class LombokTest {
    private String message;
    private int value;

    public static void main(String[] args) {
        LombokTest test = new LombokTest();
        test.setMessage("Lombok is working!");
        test.setValue(42);

        System.out.println(test.getMessage());
        System.out.println(test.getValue());
    }
}
