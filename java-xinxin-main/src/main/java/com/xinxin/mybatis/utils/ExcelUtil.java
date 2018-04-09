package com.xinxin.mybatis.utils;

import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.apache.poi.hssf.usermodel.HSSFCell;
import org.apache.poi.hssf.usermodel.HSSFDateUtil;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.xssf.usermodel.XSSFCell;

/**
 * Excel工具类
 *
 * @author lp
 */
public class ExcelUtil {

  public static final String OFFICE_EXCEL_2003_POSTFIX = "xls";
  public static final String OFFICE_EXCEL_2010_POSTFIX = "xlsx";
  public static final String EMPTY = "";
  public static final String POINT = ".";
  public static SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd  HH:mm:ss");

  /**
   * 获得path的后缀名
   */
  public static String getPostfix(String path) {
    if (path == null || EMPTY.equals(path.trim())) {
      return EMPTY;
    }
    if (path.contains(POINT)) {
      return path.substring(path.lastIndexOf(POINT) + 1, path.length());
    }
    return EMPTY;
  }

  /**
   * 单元格格式
   */
  @SuppressWarnings({"static-access", "deprecation"})
  public static String getHValue(HSSFCell hssfCell) {
    if (hssfCell.getCellType() == hssfCell.CELL_TYPE_BOOLEAN) {
      return String.valueOf(hssfCell.getBooleanCellValue());
    } else if (hssfCell.getCellType() == hssfCell.CELL_TYPE_NUMERIC) {
      String cellValue = "";
      if (HSSFDateUtil.isCellDateFormatted(hssfCell)) {
        Date date = HSSFDateUtil.getJavaDate(hssfCell.getNumericCellValue());
        cellValue = sdf.format(date);
      } else {
        DecimalFormat df = new DecimalFormat("#.##");
        cellValue = df.format(hssfCell.getNumericCellValue());
        String strArr = cellValue.substring(cellValue.lastIndexOf(POINT) + 1, cellValue.length());
        if (strArr.equals("00")) {
          cellValue = cellValue.substring(0, cellValue.lastIndexOf(POINT));
        }
      }
      return cellValue;
    } else {
      return String.valueOf(hssfCell.getStringCellValue());
    }
  }

  /**
   * 单元格格式
   */
  public static String getXValue(XSSFCell xssfCell) {
    System.out.println("单元格 格式化参数：" + xssfCell);
    if (xssfCell.getCellType() == Cell.CELL_TYPE_BOOLEAN) {
      return String.valueOf(xssfCell.getBooleanCellValue());
    } else if (xssfCell.getCellType() == Cell.CELL_TYPE_NUMERIC) {
      String cellValue = "";
      if (HSSFDateUtil.isCellDateFormatted(xssfCell)) {
        Date date = HSSFDateUtil.getJavaDate(xssfCell.getNumericCellValue());
        cellValue = sdf.format(date);
      } else {
        DecimalFormat df = new DecimalFormat("#.##");
        cellValue = df.format(xssfCell.getNumericCellValue());
        String strArr = cellValue.substring(cellValue.lastIndexOf(POINT) + 1, cellValue.length());
        if (strArr.equals("00")) {
          cellValue = cellValue.substring(0, cellValue.lastIndexOf(POINT));
        }
      }
      return cellValue;
    } else {
      return String.valueOf(xssfCell.getStringCellValue());
    }
  }
  
  // /**
  // * 自定义xssf日期工具类
  // * @author lp
  // *
  // */
  // class XSSFDateUtil extends DateUtil{
  // protected static int absoluteDay(Calendar cal, boolean  use1904windowing) {
  // return DateUtil.absoluteDay(cal, use1904windowing);
  // }
  // }

}