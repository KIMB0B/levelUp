package com.levelup.visitor.service;

import lombok.Getter;

@Getter
public class VisitServicePlain {

    private int count = 0;

    public int increment() {
        return ++count;
    }
}
