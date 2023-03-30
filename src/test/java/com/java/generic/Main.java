package com.java.generic;

import com.java.nongeneric.IntTest;


public class Main{
    public static void main(String[] args) {
        Generic<Integer> generic = new Generic<>(34);
        System.out.println(generic.getObj());
        Generic<String> generic1 = new Generic<>("Roznin");
        System.out.println(generic1.getObj());
        Generic<Double> generic2 = new Generic<>(5.8);
        System.out.println(generic2.getObj());
        Generic<IntTest> generic3 = new Generic<>(new IntTest(67));
        System.out.println(generic3.getObj());
    }


}
