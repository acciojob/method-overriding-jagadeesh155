package com.driver;

public class Main {
    public static void main(String[] args) {
        A objA = new B();
        System.out.println(objA.meth());

        B objB = new B();
        System.out.println(objB.meth());
    }
}

