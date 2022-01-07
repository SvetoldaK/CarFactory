package com.github.svetoldak.carfactory;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    private static final int BRAND_INDEX = 0;
    private static final int COLOR_INDEX = 1;
    private static final int TYPE_INDEX = 2;
    private static final int OPTION1_INDEX = 3;
    private static final int OPTION2_INDEX = 4;

    public static void main(String[] args) throws FileNotFoundException {

        File csvData = new File("src/main/resources/data.csv");
        FileReader fileReader = new FileReader(csvData);

        try {
            CSVParser csvParser = CSVParser.parse(fileReader, CSVFormat.newFormat(';'));

            for (CSVRecord csvRecord : csvParser) {
                String brand = (csvRecord.get(BRAND_INDEX));
                String color = (csvRecord.get(COLOR_INDEX));
                String type = (csvRecord.get(TYPE_INDEX));
                boolean option1 = Boolean.parseBoolean((csvRecord.get(OPTION1_INDEX)));
                boolean option2 = Boolean.parseBoolean((csvRecord.get(OPTION2_INDEX)));

                Calculator calculator = new Calculator();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
