package com.java.interrface;

public class InterfaceTest implements Printable {

    public static void main(String[] args) {

        Printable.mul(6,4);
        Printable printable=new InterfaceTest();
        printable.add(6,5);
        printable.min(10,7);
    }
    @Override
    public void add(int a, int b) {
        System.out.println(a+b);
    }
}
