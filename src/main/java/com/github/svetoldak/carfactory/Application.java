package com.github.svetoldak.carfactory;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;

import java.nio.charset.Charset;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.List;

import static com.github.svetoldak.carfactory.AdditionalOption.*;

public class Application {

    private static final int BRAND_INDEX = 0;
    private static final int COLOR_INDEX = 1;
    private static final int TYPE_INDEX = 2;
    private static final int CAR_CHILD_SEAT_INDEX = 3;
    private static final int ANTI_REFLECTIVE_MIRRORS_INDEX = 4;
    private static final int M_EQUIPMENT_INDEX = 5;
    private static final int AIR_SUSPENSION_INDEX = 6;
    private static final int MOLDING_INDEX = 7;
    private static final int FOG_LIGHTS_INDEX = 8;

    public static void main(String[] args) {
        List<Car> carList = new ArrayList<>();

        Path path = Path.of("src/main/resources/data.csv");

        try {
            CSVParser csvParser = CSVParser.parse(path, Charset.forName("UTF-8"), CSVFormat.newFormat(';'));

            for (CSVRecord csvRecord : csvParser) {
                Car car = new Car();
                car.setBrand(Brand.valueOf(csvRecord.get(BRAND_INDEX).toUpperCase()));
                car.setColor(Color.valueOf(csvRecord.get(COLOR_INDEX).toUpperCase()));
                car.setEngineType(EngineType.valueOf(csvRecord.get(TYPE_INDEX).toUpperCase()));
                car.setOptions(getOptions(csvRecord));
                carList.add(car);
                System.out.println(car);
                System.out.println("Итоговая стоимость: " + car.getPrice());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static List<AdditionalOption> getOptions(CSVRecord csvRecord) {
        List<AdditionalOption> options = new ArrayList<>();
        if (Boolean.parseBoolean(csvRecord.get(CAR_CHILD_SEAT_INDEX))) {
            options.add(CAR_CHILD_SEAT);
        }
        if (Boolean.parseBoolean(csvRecord.get(ANTI_REFLECTIVE_MIRRORS_INDEX))) {
            options.add(ANTI_REFLECTIVE_MIRRORS);
        }
        if (Boolean.parseBoolean(csvRecord.get(M_EQUIPMENT_INDEX))) {
            options.add(M_EQUIPMENT);
        }
        if (Boolean.parseBoolean(csvRecord.get(AIR_SUSPENSION_INDEX))) {
            options.add(AIR_SUSPENSION);
        }
        if (Boolean.parseBoolean(csvRecord.get(MOLDING_INDEX))) {
            options.add(MOLDING);
        }
        if (Boolean.parseBoolean(csvRecord.get(FOG_LIGHTS_INDEX))) {
            options.add(FOG_LIGHTS);
        }
        return options;
    }
}
