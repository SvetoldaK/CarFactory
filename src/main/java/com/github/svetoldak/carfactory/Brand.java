package com.github.svetoldak.carfactory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

import java.util.Map;

import static com.github.svetoldak.carfactory.AdditionalOption.*;

@Getter
@RequiredArgsConstructor
public enum Brand {
    BMW(2_200_000, Map.of(CAR_CHILD_SEAT, 10_000,
            ANTI_REFLECTIVE_MIRRORS, 30_000,
            AIR_SUSPENSION, 30_000,
            M_EQUIPMENT, 15_000,
            MOLDING, 20_000,
            FOG_LIGHTS, 13_000)),
    AUDI(2_000_000, Map.of(CAR_CHILD_SEAT, 20_000,
            ANTI_REFLECTIVE_MIRRORS, 30_000,
            M_EQUIPMENT, 14_000,
            AIR_SUSPENSION, 30_000,
            MOLDING, 30_000,
            FOG_LIGHTS, 10_000)),
    VOLVO(1_800_000, Map.of(CAR_CHILD_SEAT, 30_000,
            ANTI_REFLECTIVE_MIRRORS, 40_000,
            M_EQUIPMENT, 11_000,
            AIR_SUSPENSION, 30_000,
            MOLDING, 20_000,
            FOG_LIGHTS, 6_000));

    private final int price;
    private final Map<AdditionalOption, Integer> options;
}
