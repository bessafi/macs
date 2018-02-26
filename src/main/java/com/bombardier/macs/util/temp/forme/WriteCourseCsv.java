package com.bombardier.macs.util.temp.forme;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WriteCourseCsv {

    public static void main(String... args) throws IOException {

        // get file from resources folder
        String fileName = "/courses.csv";

        List<Course> courses = new ArrayList<>();
        courses.add(new Course(1, "SuperCsv", "Write csv file", 1234.56, new Date()));
        courses.add(new Course(2, "SuperCsv", "Read csv file", 1234.56, new Date()));

        // write csv
        CsvFileWriter.writeCsv(fileName, courses);
    }
}