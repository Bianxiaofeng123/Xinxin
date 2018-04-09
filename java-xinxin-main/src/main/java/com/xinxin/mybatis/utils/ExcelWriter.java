package com.xinxin.mybatis.utils;

import java.awt.Color;
import java.io.OutputStream;
import java.net.URLEncoder;
import java.util.List;
import java.util.Map;
import javax.servlet.http.HttpServletResponse;
import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Font;
import org.apache.poi.ss.usermodel.IndexedColors;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.xssf.usermodel.XSSFCellStyle;
import org.apache.poi.xssf.usermodel.XSSFColor;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.extensions.XSSFCellBorder.BorderSide;
import org.springframework.stereotype.Component;

@Component
public class ExcelWriter {

  public static void exportExcel(HttpServletResponse response, String fileName,
      Map<String, Object> params, String name) throws Exception {
    // 告诉浏览器用什么软件可以打开此文件
    response.setHeader("content-Type", "application/vnd.ms-excel");
    // 下载文件的默认名称
    response.setHeader("Content-Disposition",
        "attachment;filename=" + URLEncoder.encode(fileName, "utf-8"));
    exportExcel(name, params, response.getOutputStream());
  }

  public static void exportExcel(String name, Map<String, Object> params, OutputStream out)
      throws Exception {

    XSSFWorkbook wb = new XSSFWorkbook();
    String sheetName = name;
    if (null == sheetName) {
      sheetName = "Sheet1";
    }
    XSSFSheet sheet = wb.createSheet(sheetName);
    writeExcel(wb, sheet, params);

    wb.write(out);
  }

  private static void writeExcel(XSSFWorkbook wb, Sheet sheet, Map<String, Object> params) {

    int rowIndex = 0;
    int titlsize = 0;
    try {
      List<String> titles = (List<String>) params.get("titles");
      rowIndex = writeTitlesToExcel(wb, sheet, titles);
      titlsize = titles.size();
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }

    try {
      List<List<String>> rows = (List<List<String>>) params.get("rows");
      writeRowsToExcel(wb, sheet, rows, rowIndex);
    } catch (Exception e) {
      e.printStackTrace();
      return;
    }
    autoSizeColumns(sheet, titlsize + 1);

  }

  private static int writeTitlesToExcel(XSSFWorkbook wb, Sheet sheet, List<String> titles) {
    int rowIndex = 0;
    int colIndex = 0;

    Font titleFont = wb.createFont();
    titleFont.setFontName("simsun");
//	        titleFont.setBold(true);
    // titleFont.setFontHeightInPoints((short) 14);
    titleFont.setColor(IndexedColors.BLACK.index);

    XSSFCellStyle titleStyle = wb.createCellStyle();
    titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
    titleStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
    titleStyle.setFillForegroundColor(new XSSFColor(new Color(182, 184, 192)));
    titleStyle.setFillPattern(XSSFCellStyle.SOLID_FOREGROUND);
    titleStyle.setFont(titleFont);
    setBorder(titleStyle, BorderStyle.THIN, new XSSFColor(new Color(0, 0, 0)));

    Row titleRow = sheet.createRow(rowIndex);
    // titleRow.setHeightInPoints(25);
    colIndex = 0;

    for (String field : titles) {
      Cell cell = titleRow.createCell(colIndex);
      cell.setCellValue(field);
      cell.setCellStyle(titleStyle);
      colIndex++;
    }

    rowIndex++;
    return rowIndex;
  }

  private static int writeRowsToExcel(XSSFWorkbook wb, Sheet sheet, List<List<String>> rows,
      int rowIndex) {
    int colIndex = 0;

    Font dataFont = wb.createFont();
    dataFont.setFontName("simsun");
    // dataFont.setFontHeightInPoints((short) 14);
    dataFont.setColor(IndexedColors.BLACK.index);

    XSSFCellStyle dataStyle = wb.createCellStyle();
    dataStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
    dataStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
    dataStyle.setFont(dataFont);
    setBorder(dataStyle, BorderStyle.THIN, new XSSFColor(new Color(0, 0, 0)));

    for (List<String> rowData : rows) {
      Row dataRow = sheet.createRow(rowIndex);
      // dataRow.setHeightInPoints(25);
      colIndex = 0;

      for (String cellData : rowData) {
        Cell cell = dataRow.createCell(colIndex);
        if (cellData != null) {
          cell.setCellValue(cellData);
        } else {
          cell.setCellValue("");
        }

        cell.setCellStyle(dataStyle);
        colIndex++;
      }
      rowIndex++;
    }
    return rowIndex;
  }

  private static void autoSizeColumns(Sheet sheet, int columnNumber) {

    for (int i = 0; i < columnNumber; i++) {
      int orgWidth = sheet.getColumnWidth(i);
      sheet.autoSizeColumn(i, true);
      int newWidth = (int) (sheet.getColumnWidth(i) + 100);
      if (newWidth > orgWidth) {
        sheet.setColumnWidth(i, newWidth);
      } else {
        sheet.setColumnWidth(i, orgWidth);
      }
    }
  }

  private static void setBorder(XSSFCellStyle style, BorderStyle border, XSSFColor color) {
    style.setBorderTop(border);
    style.setBorderLeft(border);
    style.setBorderRight(border);
    style.setBorderBottom(border);
    style.setBorderColor(BorderSide.TOP, color);
    style.setBorderColor(BorderSide.LEFT, color);
    style.setBorderColor(BorderSide.RIGHT, color);
    style.setBorderColor(BorderSide.BOTTOM, color);
  }

}