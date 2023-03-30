package com.java.namingconvetion;

public class Arithmetic {
    int a = 2;
    int b= 4;
    int sum = a+b;
    int cube(){
        return sum;
    }
    double test(double a){
        return sum*a;
    }

    public static void main(String[] args){
        Arithmetic myMultiplication = new Arithmetic();

        System.out.println("The cube is :" + myMultiplication.cube());
        System.out.println("The double cube is " + myMultiplication.test(5.0));

    }
}

