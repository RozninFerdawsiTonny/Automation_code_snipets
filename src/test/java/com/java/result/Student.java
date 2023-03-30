package com.java.result;
public class Student {
    public static void main(String[] args) {
        Result res = new Result("Tonny", 90, 98);
        System.out.println(res.getName());
        System.out.println(res.getEngMark());
        System.out.println(res.getMathMark());
        Department dep = new Department();
        dep.setDepName("SWE");
        System.out.println(dep.getDepName());
        dep.setStuNum(123);
        System.out.println(dep.getStuNum());
        ResultView resview = new ResultView();
        System.out.println(resview.getCse());
        System.out.println(resview.getSwe());

    }
}
