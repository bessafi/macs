package com.bombardier.macs.util.csv;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.supercsv.io.CsvBeanWriter;
import org.supercsv.io.ICsvBeanWriter;
import org.supercsv.prefs.CsvPreference;

import com.bombardier.macs.json.model.CsdWorkcenter;

public class CsvView extends AbstractCsvView {
@Override
protected void buildCsvDocument(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {

    response.setHeader("Content-Disposition", "attachment; filename=\"my-csv-file.csv\"");
    ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
            CsvPreference.STANDARD_PREFERENCE);
  
   /* 
    ICsvBeanWriter csvWriter = new CsvBeanWriter(response.getWriter(),
            CsvPreference.STANDARD_PREFERENCE);

    csvWriter.writeHeader(header);

       csvWriter.write(wc, header);
    
    csvWriter.close();*/


}
}