package com.github.svetoldak.carfactory.Car;

import com.github.svetoldak.carfactory.Car.brands.Audi;
import com.github.svetoldak.carfactory.Car.brands.BMW;
import com.github.svetoldak.carfactory.Car.brands.Volvo;

import java.util.ArrayList;

public class OrderCreation {

    private static ArrayList<MachineCharacteristics> cars;

    public static MachineCharacteristics initialize(String brand, String color, Object engineType, Object additionalOptions) {
        MachineCharacteristics.Color tmp;
        MachineCharacteristics.engineType tmp2;
        MachineCharacteristics.AdditionalOptions tmp3;

        if (color.equals(MachineCharacteristics.Color.RED.toString())) {
            tmp = MachineCharacteristics.Color.RED;
        } else if (color.equals(MachineCharacteristics.Color.GREEN.toString())) {
            tmp = MachineCharacteristics.Color.GREEN;
        } else if (color.equals(MachineCharacteristics.Color.BLUE.toString())) {
            tmp = MachineCharacteristics.Color.BLUE;
        } else {
            throw new IllegalArgumentException("Данного цвета нет в базе данных! " + color);
        }

        if (engineType.equals(MachineCharacteristics.engineType.V8.toString())) {
            tmp2 = MachineCharacteristics.engineType.V8;
        } else if (engineType.equals(MachineCharacteristics.engineType.V12.toString())) {
            tmp2 = MachineCharacteristics.engineType.V12;
        } else {
            throw new IllegalArgumentException("Данный тип двигателя отсутствует! " + engineType);
        }

/*        ТУТ Я ОСОЗНАЛА, ЧТО ПО ИДЕЕ МНЕ ДОЛЖНО ПРИЙТИ ДВА ПАРАМЕТРА ОБА ИЗ КОТОРЫХ МОГУТ БЫТЬ ТРУ, ЗНАЧИТ ТАКАЯ ПРОВЕРКА
          НЕ ПОДОЙДЕТ.
 */
        if (additionalOptions.equals(MachineCharacteristics.AdditionalOptions.AIR_SUSPENSION.toString())) {
            tmp3 = MachineCharacteristics.AdditionalOptions.AIR_SUSPENSION;
        } else if (additionalOptions.equals(MachineCharacteristics.AdditionalOptions.ANTI_REFLECTIVE_MIRRORS.toString())) {
            tmp3 = MachineCharacteristics.AdditionalOptions.ANTI_REFLECTIVE_MIRRORS;
        }

        if (brand.equals(MachineCharacteristics.Brand.BMW.toString())) {
            return new BMW(brand, tmp, tmp2, tmp3);
        } else if (brand.equals(MachineCharacteristics.Brand.VOLVO.toString())) {
            return new Volvo(brand, tmp, tmp2, tmp3);
        } else if (brand.equals(MachineCharacteristics.Brand.AUDI.toString())) {
            return new Audi(brand, tmp, tmp2, additionalOptions);
        } else {
            throw new IllegalArgumentException("Ошибка! данная марка автомобиля, не продается!");
        }
    }
}
