package com.driver;

public class Main {

    // Task 1: Create a class A with a method named meth
    public static class A {
        public String meth() {
            return "Invoking method from class A";
        }
    }

    // Task 2: Create a class B which extends class A
    public static class B extends A {
        // Task 4: Override method meth of class A in class B
        @Override
        public String meth() {
            return "Method is overridden in Extended class B";
        }
    }

    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        A objA = new B();
        System.out.println(objA.meth());

        // Task 5: Call this overridden method from object of class B
        B objB = new B();
        System.out.println(objB.meth());
    }
}
