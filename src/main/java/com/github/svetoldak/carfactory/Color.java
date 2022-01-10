package com.github.svetoldak.carfactory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum Color {
    RED(7_000),
    GREEN(50_000),
    BLUE(20_000);

    private final int price;
}
