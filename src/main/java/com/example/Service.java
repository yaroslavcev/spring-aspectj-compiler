package com.example;

public class Service {
    private ParentAbstractClass clazz;

    public Service(ParentAbstractClass clazz) {
        this.clazz = clazz;
    }

    public void process() {
        clazz.method();
    }
}