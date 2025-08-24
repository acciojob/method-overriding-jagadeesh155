package com.driver;

// Task 1: Create a class A with a method named meth returning a string: "Invoking method from class A"
class A {
    String meth() {
        return "Invoking method from class A";
    }
}

// Task 2: Create a class B which extends class A
class B extends A {
    // Task 4: Override method meth of class A in class B
    @Override
    String meth() {
        return "Method is overridden in Extended class B";
    }
}

public class Main {
    public static void main(String[] args) {
        // Task 3: Create an object of class B and call method meth of class A with it
        A objA = new B();
        System.out.println(objA.meth()); // Output: Method is overridden in Extended class B

        // Task 5: Call this overridden method from object of class B
        B objB = new B();
        System.out.println(objB.meth()); // Output: Method is overridden in Extended class B
    }
}
