package com.java.inheritence;

public class Father {
    int num_son =2;
   public void mai(){
        //num_son = nu;
        System.out.println("Head of Family");
    }
}

class Son extends Family {
    void son(){
        System.out.println("Number of Son :");
    }

}

class Daughter extends Family {
    void daughter(){
        System.out.println("A daughter is the most valuable treasure for every father in this world.");
    }


    public void mai() {
    }
}
