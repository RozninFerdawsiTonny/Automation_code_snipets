package com.java.result;
//=====fully Encapsulation===//
public class Department {
    private String depName;
    private int stuNum;

    public void setDepName(String depName) {
     this.depName = depName;
       // this.depName = name;
    }

    public void setStuNum(int stuNum ) {
        this.stuNum = stuNum;
    }

    public String getDepName() {
        return depName;
    }

    public int getStuNum() {
        return stuNum;
    }
}
