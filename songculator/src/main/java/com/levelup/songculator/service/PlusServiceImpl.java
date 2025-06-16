package com.levelup.songculator.service;

import com.levelup.songculator.dto.NumbersInputDto;
import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Service;

@Service
@Getter
@Setter
public class PlusServiceImpl implements CalculateService{

    public int number;

    @Override
    public int calculate(NumbersInputDto numbersInputDto) {
        return numbersInputDto.getN1() + numbersInputDto.getN2();
    }
}
