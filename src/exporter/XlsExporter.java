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
        if (!employees.isEmpty() && employees.get(0) instanceof Manager) {
            try {
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Employees");


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
                    row1.createCell(0).setCellValue(employees.get(i).getId());
                    row1.createCell(1).setCellValue(employees.get(i).getFirstName());
                    row1.createCell(2).setCellValue(employees.get(i).getLastName());
                }
                FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");
                workbook.write(fileOutput);
                fileOutput.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            try {
                Workbook workbook = new XSSFWorkbook();
                Sheet sheet = workbook.createSheet("Employees");


                String[] columnHeadings = {"ID", "First Name", "Last Name", "Country", "Average Sales", "Active"};
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
                    row1.createCell(0).setCellValue(employees.get(i).getId());
                    row1.createCell(1).setCellValue(employees.get(i).getFirstName());
                    row1.createCell(2).setCellValue(employees.get(i).getLastName());
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


           /* Row row = sheet.createRow(1);
            Cell cell0 = row.createCell(1);


            Cell cell1 = row.createCell(1);
            Cell cell2 = row.createCell(1);



            for (int i = 0; i < employees.size(); i++) {
                cell0.setCellValue("ID");
                cell1.setCellValue("First Name");
                cell2.setCellValue("Last Name");

                Row row1 = sheet.createRow(rownum++);
                row1.createCell(0).setCellValue(employees.get(i).getId());
                row1.createCell(1).setCellValue(employees.get(i).getFirstName());
                row1.createCell(2).setCellValue(employees.get(i).getLastName());

            }

            FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");
            workbook.write(fileOutput);
            fileOutput.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
} */

          /*  for (int i = 0; i < employees.size(); i++) {
                for (int j = 0; j < 3; j++) {
                    Cell cell = row.createCell(j);
                    for (int k = 0; k < employees.size(); k++) {

                        if (cell.getColumnIndex() == 0) {
                            cell.setCellValue(employees.get(j).getId());
                        } else if (cell.getColumnIndex() == 1) {
                            cell.setCellValue(employees.get(j).getFirstName());
                        } else cell.setCellValue(employees.get(k).getLastName());

                    }
                    Cell cell5 = row.createCell(j + 1);
                }
                row = sheet.createRow(i + 1);
            }

            FileOutputStream out = new FileOutputStream(new File("NewFile.xls"));
            workbook.write(out);
            out.close();
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        } catch (IndexOutOfBoundsException e) {
            throw new RuntimeException(e);
        } finally {

        }
    }
} */

          /*     PLANB    sheet.getCells().importCustomObjects((Collection)employees,
                    new String[] { "ID", "First Name","Last Name" }, // propertyNames
                    true, // isPropertyNameShown
                    0, // firstRow
                    0, // firstColumn
                    employees.size(), // Number of objects to be exported
                    true, // insertRows
                    null, // dateFormatString
                    false); // convertStringToNumber
            //XSSFWorkbook workbook = new XSSFWorkbook();
            XSSFSheet sheet = workbook.createSheet("sheet1");
            Workbook workbook = new Workbook();
}*/
