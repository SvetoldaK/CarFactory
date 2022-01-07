package com.github.svetoldak.carfactory.Car.brands;
import com.github.svetoldak.carfactory.Car.MachineCharacteristics;

import java.util.Set;

public class Audi extends MachineCharacteristics {

    public static int PRICE_AUDI = 1_150_000;

    public Audi(String brand,
                Color color,
                MachineCharacteristics.engineType engineType,
                Set<AdditionalOptions> additionalOptions) {
        super(brand, color, engineType, additionalOptions);
    }
}
