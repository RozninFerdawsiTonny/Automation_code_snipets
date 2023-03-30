package com.java.generic;

import java.util.ArrayList;
import java.util.List;

public class ListTest {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(12);
        list.add(13);
        list.add(18);
        list.add(19);
        list.add(16);
        list.add(15);
        System.out.println("======================================");
        list.remove(3);
        System.out.println(list.get(3));
        list.add(2,9);
        System.out.println(list.get(2));
        for (Integer i : list){
           System.out.println(i);
        }
        
    }



}
