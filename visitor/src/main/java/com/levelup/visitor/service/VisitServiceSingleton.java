package com.levelup.visitor.service;

import lombok.Getter;

public class VisitServiceSingleton {

    @Getter
    private static final VisitServiceSingleton instance = new VisitServiceSingleton();
    private int count = 0;

    private VisitServiceSingleton() {}

//    public static VisitServiceSingleton getInstance() {
//        return instance;
//    }

    public int increment() {
        return ++this.count;
    }
}
