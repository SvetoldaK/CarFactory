package com.github.svetoldak.carfactory;

import com.github.svetoldak.carfactory.Car.brands.Audi;
import com.github.svetoldak.carfactory.Car.brands.BMW;
import com.github.svetoldak.carfactory.Car.brands.Volvo;

import java.util.Objects;

public class Calculator {

    public int calculatorFullPriceBmw(BMW bmw) {
        Integer additionalPrice = bmw.getAdditionalOptions().stream()
                .filter(Objects::nonNull)
                .map(BMW.AdditionalOptions::getPrice)
                .reduce(0,Integer::sum);

        return BMW.PRICE_BMW = additionalPrice;
    }

    public int calculatorFullPriceAudi(Audi audi) {
        Integer additionalPrice = audi.getAdditionalOptions().stream()
                .filter(Objects::nonNull)
                .map(Audi.AdditionalOptions::getPrice)
                .reduce(0,Integer::sum);

        return Audi.PRICE_AUDI = additionalPrice;
    }

    public int calculatorFullPriceVolvo(Volvo volvo) {
        Integer additionalPrice = volvo.getAdditionalOptions().stream()
                .filter(Objects::nonNull)
                .map(Volvo.AdditionalOptions::getPrice)
                .reduce(0,Integer::sum);

        return Volvo.PRICE_VOLVO = additionalPrice;
    }
}
