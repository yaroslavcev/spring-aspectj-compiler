package com.example;

import java.util.List;

public class ConcreteClass extends ParentAbstractClass {
    @Override
    public void abstractMethod(List<String> names) {
        System.out.println("Look up! AOP should have executed");
    }
}