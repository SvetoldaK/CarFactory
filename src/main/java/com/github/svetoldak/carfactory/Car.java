package com.github.svetoldak.carfactory;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Data
public class Car {

    private Brand brand;
    private Color color;
    private EngineType engineType;
    private List<AdditionalOption> options = new ArrayList<>();

    public int getPrice() {
        int sum = options.stream().map(additionalOption -> brand.getOptions().get(additionalOption)).filter(Objects::nonNull).mapToInt(value -> value).sum();
        return sum + brand.getPrice() + color.getPrice() + engineType.getPrice();
    }
}
