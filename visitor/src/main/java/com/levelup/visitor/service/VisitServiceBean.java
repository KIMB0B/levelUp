package com.levelup.visitor.service;

import org.springframework.stereotype.Service;

@Service
public class VisitServiceBean {

    private int count = 0;

    public int increment() {
        return ++this.count;
    }
}
