
package com.verizon.dd;

import com.opencsv.CSVReader;
import org.testng.annotations.DataProvider;

import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CSVDataProvider {

    @DataProvider(name = "csvData")
    public static Iterator<Object[]> readCSVData() throws Exception {
        List<Object[]> testData = new ArrayList<>();

        try (CSVReader reader = new CSVReader(new FileReader("C:\\javaworkspace\\verizon20251\\SeleniumApp1\\src\\main\\java\\data.csv"))) {
            String[] line;
            boolean isFirstLine = true;

            while ((line = reader.readNext()) != null) {
                if (isFirstLine) { // Skip header
                    isFirstLine = false;
                    continue;
                }
                testData.add(new Object[]{line[0], line[1]});
            }
        }
        return testData.iterator();
    }
}
