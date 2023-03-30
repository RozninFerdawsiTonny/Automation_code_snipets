package com.java.polymorphism;

public class Adder {
    static int add(int a,int b){
        return a+b;
    }
    static int add(int a,int b,int c){
        return a+b+c;
    }


    //======Overloading=====//
}

//=== Overriding===///
class Overriding extends Adder {
    void add(){
        System.out.println("Tonny");
    }

}
