package com.bombardier.macs.util.temp.forme;
import org.supercsv.cellprocessor.*;
import org.supercsv.cellprocessor.constraint.*;
import org.supercsv.cellprocessor.ift.CellProcessor;
import org.supercsv.io.*;
import org.supercsv.prefs.CsvPreference;

import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

public class CsvFileWriter {

    public CsvPreference customCsvPreference(){
        return new CsvPreference.Builder('|', ',', "\n").build();
    }

    public static void writeCsv(String csvFileName, List<Course> courses) throws IOException {
        ICsvBeanWriter beanWriter = null;
        try {
            beanWriter = new CsvBeanWriter(new FileWriter(csvFileName), CsvPreference.EXCEL_PREFERENCE);

            // the header elements are used to map the bean values to each column (names must match)
            final String[] header = new String[] { "id", "name", "description", "price", "date"};
            final CellProcessor[] processors = getProcessors();

            // write the header
            beanWriter.writeHeader(header);
           
            // write the beans
            for(final Course course : courses ) {
                beanWriter.write(course, header, processors);
            }
        } finally {
            if( beanWriter != null ) {
                beanWriter.close();
            }
        }
    }

    private static CellProcessor[] getProcessors(){
        return new CellProcessor[] {
                new Unique(new ParseInt()),
                new NotNull(),
                new Optional(),
                new ParseDouble(),
                new FmtDate("dd/MM/yyyy")};
    }
}