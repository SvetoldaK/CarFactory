package com.github.svetoldak.carfactory.Car;
import lombok.Data;
import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Set;

@Data
@RequiredArgsConstructor

public abstract class MachineCharacteristics {

    private final String brand;
    private final Color color;
    private int price;
    private final engineType engineType;
    private final Set<AdditionalOptions> additionalOptions;

    @Getter
    @RequiredArgsConstructor
    public enum Color {
        RED(0),
        GREEN(50_000),
        BLUE(20_000);

        private final int price;
    }

    public enum engineType {
        V8,
        V12
    }

    public enum Brand {
        BMW,
        AUDI,
        VOLVO
    }

    @Getter
    @RequiredArgsConstructor
    public enum AdditionalOptions {
        CAR_CHILD_SEAT(Brand.VOLVO, "Наличие детского сиденья", 95_000),
        ANTI_REFLECTIVE_MIRRORS(Brand.VOLVO, "Наличие антибликовых зеркал", 115_000),
        M_EQUIPMENT(Brand.BMW,"Наличие M пакета ", 600_000),
        AIR_SUSPENSION(Brand.BMW,"Наличие пневматической подвески", 150_000),
        MOLDING(Brand.AUDI,"Наличие фирменных молдингов ", 75_000),
        FOG_LIGHTS(Brand.AUDI,"Наличие противотуманок", 50_000);

        private final Brand availableFor;
        private final String name;
        private final int price;
    }
}
