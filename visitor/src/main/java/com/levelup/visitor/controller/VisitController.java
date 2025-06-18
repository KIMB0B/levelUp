package com.levelup.visitor.controller;

import com.levelup.visitor.service.VisitServiceBean;
import com.levelup.visitor.service.VisitServicePlain;
import com.levelup.visitor.service.VisitServiceSingleton;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@AllArgsConstructor
public class VisitController {

    private final VisitServiceBean visitServiceBean;

    @GetMapping("/visit/plain")
    public String visitPlain() {
        VisitServicePlain visitService = new VisitServicePlain();
        int count = visitService.increment();
        return "Visit count: " + count;
    }

    @GetMapping("/visit/singleton")
    public String visitSingleton() {
        VisitServiceSingleton visitService = VisitServiceSingleton.getInstance();
        int count = visitService.increment();
        return "Visit count: " + count;
    }

    @GetMapping("/visit/bean")
    public String visitBean() {
        int count = visitServiceBean.increment();
        return "Visit count: " + count;
    }
}
