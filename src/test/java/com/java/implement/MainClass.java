package com.java.implement;

public class MainClass {
    public static void main(String[] args) {
        Toyota brand = new Toyota();
        brand.carname();
        System.out.println(brand.brandname());
        System.out.println(brand.carprice(4801500));
        Mercedes brand2 = new Mercedes();
        System.out.println(brand2.brandname());
        System.out.println(brand2.brandrate(20000));
        Hunda brand3 = new Hunda();
        System.out.println(brand3.brandname());


    }
}
