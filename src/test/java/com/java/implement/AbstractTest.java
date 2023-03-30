package com.java.implement;

public class AbstractTest extends Language{
    public static void main(String[] args) {
        AbstractTest obj = new AbstractTest();
        obj.display();
        System.out.println(obj.display2());
    }

    @Override
    int display2() {
        return 3;

    }
}

