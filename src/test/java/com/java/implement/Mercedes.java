package com.java.implement;

public class Mercedes extends CarBrand{
    double brandrate(double amount) {
        return amount*0.5*5;
    }

    @Override
    String brandname() {
        return "Mercedes";
    }
}
