package xlspackage.cellfillers;

import model.Employee;
import model.Seller;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class CellFillerSellers {
    private int rownum = 0;

    public void fillCells(List<Employee> employees, Sheet sheet) {
        for (Employee employee : employees
        ) {
            Seller seller = (Seller) employee;
            Row row1 = sheet.createRow(++rownum);
            row1.createCell(0).setCellValue(seller.getId());
            row1.createCell(1).setCellValue(seller.getFirstName());
            row1.createCell(2).setCellValue(seller.getLastName());
            row1.createCell(3).setCellValue(seller.getCity());
            row1.createCell(4).setCellValue(seller.getAverageSales());
            row1.createCell(5).setCellValue(seller.isActive());
        }
    }
}
