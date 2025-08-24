package com.driver;

public class Main {

    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    public static class B extends A {
        @Override
        public String meth() {
            return "Method is overridden in class B";
        }
    }

    public static void main(String[] args) {
        A objA = new B();
        System.out.println(objA.meth());

        B objB = new B();
        System.out.println(objB.meth());
    }
}
