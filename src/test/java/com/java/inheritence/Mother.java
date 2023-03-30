package com.java.inheritence;

//=====Single Level inheritance=====//
public class Mother {
    int son_num;
    int dau_num;

    public void mother() {
        System.out.println("Mother is a significant member of every family.");
    }

}

class Sister extends Mother {
    String sis_name;
    int sis_num;
    String bro_name;
    int bro_num;

    Sister(String name, int num) {
        sis_name = name;
        sis_num = num;
//        String bro_name = name;
//        int bro_num = num;
    }

    public Sister() {

    }

    void display() {
        System.out.println("Sister name is : " + sis_name);
        System.out.println("number of Child :" + sis_num);

    }

}


