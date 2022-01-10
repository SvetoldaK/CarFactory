package com.github.svetoldak.carfactory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum AdditionalOption {

    CAR_CHILD_SEAT("Наличие детского сиденья"),
    ANTI_REFLECTIVE_MIRRORS("Наличие антибликовых зеркал"),
    M_EQUIPMENT("Наличие M пакета"),
    AIR_SUSPENSION("Наличие пневматической подвески"),
    MOLDING("Наличие фирменных молдингов"),
    FOG_LIGHTS("Наличие противотуманок");

    private final String name;
}
