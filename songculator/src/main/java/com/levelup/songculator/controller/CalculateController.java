package com.levelup.songculator.controller;

import com.levelup.songculator.dto.NumbersInputDto;
import com.levelup.songculator.service.CalculateService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
@AllArgsConstructor
public class CalculateController {

    private final Map<String, CalculateService> calulateServiceMap;

//    @GetMapping("/songculator")
//    public int calcuate(@RequestParam int n1, @RequestParam int n2) {
//        return plusService.calculate(new NumbersInputDto(n1, n2));
//    }

//    @GetMapping("/songculator")
//    public int calcuate(@RequestBody NumbersInputDto numbersInputDto) {
//        return plusService.calculate(numbersInputDto);
//    }

//    @GetMapping("/songculator")
//    public void calculate(@RequestParam NumbersInputDto numbersInputDto) {
//        for (CalculateService calulateService : calulateServiceMap.values()) {
//            System.out.println(calulateService.calculate(numbersInputDto));
//        }
//    }

    @GetMapping("/songculator")
    public int calcuate(@RequestParam String buho, @RequestBody NumbersInputDto numbersInputDto) {
        switch (buho) {
            case "더하기":
                return calulateServiceMap.get("plusServiceImpl").calculate(numbersInputDto);
            case "빼기":
                return calulateServiceMap.get("minusServiceImpl").calculate(numbersInputDto);
            case "곱하기":
                return calulateServiceMap.get("multipleServiceImpl").calculate(numbersInputDto);
            case "나누기":
                return calulateServiceMap.get("divideServiceImpl").calculate(numbersInputDto);
            default:
                throw new IllegalArgumentException("지원하지 않는 연산입니다.");
        }
    }
}
