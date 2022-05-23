package exporter;

import model.Employee;
import model.Manager;
import model.Seller;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import javax.swing.*;
import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XlsExporter implements Exporter {

    public void export(List<Employee> employees) {
        List<Manager> managers = new ArrayList<>();

        if (!employees.isEmpty() && employees.get(0) instanceof Manager) {
            for (int i = 0; i < employees.size(); i++) {
                managers.add((Manager) employees.get(i));
            }
            try {
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Employees");

                sheet.setColumnWidth(0, 3000);
                sheet.setColumnWidth(1, 4500);
                sheet.setColumnWidth(2, 4500);
                sheet.setColumnWidth(3, 6000);
                sheet.setColumnWidth(4, 4500);
                sheet.setColumnWidth(5, 4500);

                String[] columnHeadings = {"ID", "First Name", "Last Name", "Number Of Sellers", "Country"};
                Font headerFont = workbook.createFont();
                headerFont.setBoldweight((short) 12);
                headerFont.setFontHeightInPoints((short) 12);
                headerFont.setColor(IndexedColors.BLACK.index);
                CellStyle headerStyle = workbook.createCellStyle();
                headerStyle.setFont(headerFont);

                Row headerRow = sheet.createRow(0);
                int rownum = 0;
                for (int i = 0; i < columnHeadings.length; i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(columnHeadings[i]);
                    cell.setCellStyle(headerStyle);
                }
                for (int i = 0; i < employees.size(); i++) {

                    Row row1 = sheet.createRow(++rownum);
                    row1.createCell(0).setCellValue(managers.get(i).getId());
                    row1.createCell(1).setCellValue(managers.get(i).getFirstName());
                    row1.createCell(2).setCellValue(managers.get(i).getLastName());
                    row1.createCell(3).setCellValue(managers.get(i).getNumberOfSellers());
                    row1.createCell(4).setCellValue(managers.get(i).getCountry());
                }
                FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");
                workbook.write(fileOutput);
                fileOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            List<Seller> sellers = new ArrayList<>();
            for (int i = 0; i < employees.size(); i++) {
                sellers.add((Seller) employees.get(i));
            }
            try {
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Employees");

                sheet.setColumnWidth(0, 7000);
                sheet.setColumnWidth(1, 4500);
                sheet.setColumnWidth(2, 4500);
                sheet.setColumnWidth(3, 6000);
                sheet.setColumnWidth(4, 4500);
                sheet.setColumnWidth(5, 4500);

                String[] columnHeadings = {"ID", "First Name", "Last Name", "City", "Average Sales", "Active"};
                Font headerFont = workbook.createFont();
                headerFont.setBoldweight((short) 12);
                headerFont.setFontHeightInPoints((short) 12);
                headerFont.setColor(IndexedColors.BLACK.index);
                CellStyle headerStyle = workbook.createCellStyle();
                headerStyle.setFont(headerFont);

                Row headerRow = sheet.createRow(0);
                int rownum = 0;
                for (int i = 0; i < columnHeadings.length; i++) {
                    Cell cell = headerRow.createCell(i);
                    cell.setCellValue(columnHeadings[i]);
                    cell.setCellStyle(headerStyle);
                }
                for (int i = 0; i < employees.size(); i++) {

                    Row row1 = sheet.createRow(++rownum);
                    row1.createCell(0).setCellValue(sellers.get(i).getId());
                    row1.createCell(1).setCellValue(sellers.get(i).getFirstName());
                    row1.createCell(2).setCellValue(sellers.get(i).getLastName());
                    row1.createCell(3).setCellValue(sellers.get(i).getCity());
                    row1.createCell(4).setCellValue(sellers.get(i).getAverageSales());
                    row1.createCell(5).setCellValue(sellers.get(i).isActive());

                }
                FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");
                workbook.write(fileOutput);
                fileOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
