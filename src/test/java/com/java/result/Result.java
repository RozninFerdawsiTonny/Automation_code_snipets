package com.java.result;
//=====write Encapsulation====//
public class Result {
    private String name;
    private int engMark;
    private int mathMark;

    public Result(String name, int engMark, int mathMark) {
        this.name = name;
        this.engMark = engMark;
        this.mathMark = mathMark;
    }

    public String getName() {
        return name;
    }

    public int getEngMark() {
        return engMark;
    }

    public int getMathMark() {
        return mathMark;
    }
}
