package com.github.svetoldak.carfactory;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVParser;
import org.apache.commons.csv.CSVRecord;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Application {

    public static void main(String[] args) throws FileNotFoundException {

        File csvData = new File("src/main/resources/data.csv");
        FileReader fileReader = new FileReader(csvData);

        try {
            CSVParser csvParser = CSVParser.parse(fileReader, CSVFormat.newFormat(';'));

            for (CSVRecord csvRecord : csvParser) {
                String brand = (csvRecord.get(0));
                String color = (csvRecord.get(1));
                int engineType = Integer.parseInt((csvRecord.get(2)));
                String type = (csvRecord.get(3));
                boolean option1 = Boolean.parseBoolean((csvRecord.get(4)));
                boolean option2 = Boolean.parseBoolean((csvRecord.get(5)));

                Calculator calculator = new Calculator();

            }

        } catch (IOException e) {
            e.printStackTrace();
        }

    }
}
