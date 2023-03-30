package com.java.inheritence;

public class Family{
    public static void main(String[] args) {
        Sister sister = new Sister("Sharmin",2);
        sister.mother();
        sister.display();

       Brother brother = new Brother("Bappy",1);
        brother.display2();
        Daughter dau = new Daughter();
        dau.mai();
        dau.daughter();
    }


}
