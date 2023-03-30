package com.java.polymorphism;

public class Overloading {
    public static void main(String[] args) {
        System.out.println(Adder.add(11, 11));
        System.out.println(Adder.add(11, 11, 11));
        Overriding  mulpi = new Overriding ();
        mulpi.add();
    }

    }
