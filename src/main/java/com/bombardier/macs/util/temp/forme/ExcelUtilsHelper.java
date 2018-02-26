package com.bombardier.macs.util.temp.forme;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.List;
import java.util.Map;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.FillPatternType;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;

public class ExcelUtilsHelper {


    private static final DateFormat DATE_FORMAT = DateFormat.getDateInstance(DateFormat.SHORT);

    private String contentType;

    public ExcelUtilsHelper() {
        this.setContentType("application/vnd.ms-excel");
      //  this.setContentType("text/csv");
    }

    public final void renderMergedOutputModel(Map<String, Object> model, HttpServletRequest request, HttpServletResponse response) throws Exception {
        Workbook workbook = this.createWorkbook(model, request);
     

     // Auto-fitting the 1st column of the worksheet
    // worksheet.autoFitColumn(0);
        
        CellStyle cs = workbook.createCellStyle(); 
        cs.setFillForegroundColor(IndexedColors.GREY_25_PERCENT.getIndex()); 
        cs.setFillPattern(FillPatternType.SOLID_FOREGROUND);
        
        this.buildExcelDocument(model, workbook, request, response);
        response.setContentType(this.getContentType());
        this.renderWorkbook(workbook, response);
    }

    protected Workbook createWorkbook(Map<String, Object> model, HttpServletRequest request) {
        return new HSSFWorkbook();
    }

    protected void renderWorkbook(Workbook workbook, HttpServletResponse response) throws IOException {
        ServletOutputStream out = response.getOutputStream();
        workbook.write(out);
    	
    /*    
        try {
            FileOutputStream outputStream = new FileOutputStream("my-xls-file111.csv");
           // outputStream.write(response.);
            workbook.write(outputStream);
            workbook.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }*/
    }

    public void setContentType(String contentType) {
        this.contentType = contentType;
    }

    public String getContentType() {
        return contentType;
    }

    protected void buildExcelDocument(Map<String, Object> model,
                                      Workbook workbook,
                                      HttpServletRequest request,
                                      HttpServletResponse response) throws Exception {

        // change the file name
        response.setHeader("Content-Disposition", "attachment; filename=\"my-xls-filee.csv\"");

        @SuppressWarnings("unchecked")
        List<Course> courses = (List<Course>) model.get("courses");

        // create excel xls sheet
        Sheet sheet = workbook.createSheet("Spring MVC AbstractXlsView");
        sheet.autoSizeColumn(0);sheet.autoSizeColumn(1);sheet.autoSizeColumn(2);
       
        // Auto-fitting the 2nd row of the worksheet
        sheet.setDefaultColumnWidth(40);//.autoFitRow(1);
        // create header row
        Row header = sheet.createRow(0);
        header.createCell(0).setCellValue("ID1");
        header.createCell(1).setCellValue("Name");
        header.createCell(2).setCellValue("Date");
        

        // Create data cells
        int rowCount = 1;
        for (Course course : courses){
            Row courseRow = sheet.createRow(rowCount++);
            courseRow.createCell(0).setCellValue(course.getId());
            courseRow.createCell(1).setCellValue(course.getName());
            courseRow.createCell(2).setCellValue(DATE_FORMAT.format(course.getDate()));
        }
        
      
    }
}