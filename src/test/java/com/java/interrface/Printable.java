package com.java.interrface;

public interface Printable {
    void add(int a, int b);
    public default void min(int a , int b) {
        sub(a, b);
        //div(a, b);
        System.out.println("Answer by Default method =");
        System.out.println(a-b);
    }

    static void mul(int a, int b) {
        div(a, b);
        System.out.println(a*b);
    }
    private void sub(int a, int b)
    {
        System.out.print("Answer by Private method = ");
        System.out.println(a - b);
    }

    private static void div(int a, int b)
    {
        System.out.print("Answer by Private static method = ");
        System.out.println(a / b);
    }


}
