package com.java.inheritence;
//===Multilevel Inheritance=====//
public class Brother extends Sister {
    Brother(String name, int num) {
        super(name, num);
    }

    public Brother(String name) {
        super();
    }

    /* Brother(String name, int num) {
            super(name, num);
        }*/
    void display2(){
        System.out.println("God has blessed me with a lovely brother");
        System.out.println("Brother Name is :" + sis_name);
    }
}
