package com.github.svetoldak.carfactory.Car.brands;
import com.github.svetoldak.carfactory.Car.MachineCharacteristics;

import java.util.Set;

public class Volvo extends MachineCharacteristics {

    public static int PRICE_VOLVO = 1_300_000;

    public Volvo(String brand,
                 Color color,
                 MachineCharacteristics.engineType engineType,
                 Set<AdditionalOptions> additionalOptions) {
        super(brand, color, engineType, additionalOptions);
    }
}
