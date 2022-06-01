package xlspackage.design;

import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class HeadFontDesigner {
    Workbook workbook = new XSSFWorkbook();

    public void headDesign(String[] array, Sheet sheet) {
        Font headerFont = workbook.createFont();
        headerFont.setBoldweight((short) 12);
        headerFont.setFontHeightInPoints((short) 12);
        headerFont.setColor(IndexedColors.BLACK.index);
        CellStyle headerStyle = workbook.createCellStyle();
        headerStyle.setFont(headerFont);

        Row headerRow = sheet.createRow(0);
        int rownum = 0;
        for (String string : array
        ) {
            Cell cell = headerRow.createCell(rownum);
            cell.setCellValue(string);
        }
        for (int i = 0; i < array.length; i++) {
            Cell cell = headerRow.createCell(i);
            cell.setCellValue(array[i]);
        }
    }
}
