package com.example;

import java.util.Arrays;
import java.util.List;

public abstract class ParentAbstractClass {
    public void method() {
        abstractMethod(Arrays.asList(""));
    }

    public abstract void abstractMethod(List<String> names);
}