package com.github.svetoldak.carfactory.Car.brands;
import com.github.svetoldak.carfactory.Car.MachineCharacteristics;
import lombok.Getter;

import java.util.Set;

@Getter
public class BMW extends MachineCharacteristics {

    public static int PRICE_BMW = 1_200_000;

    public BMW(String brand,
               Color color,
               MachineCharacteristics.engineType engineType,
               Set<AdditionalOptions> additionalOptions) {
        super(brand, color, engineType, additionalOptions);
    }
}
