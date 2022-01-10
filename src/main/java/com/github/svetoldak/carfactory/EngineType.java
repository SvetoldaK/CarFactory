package com.github.svetoldak.carfactory;

import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum EngineType {
    V8(10_800),
    V12(15_000);

    private final int price;
}
