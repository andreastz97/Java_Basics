package xlspackage.cellfillers;

import model.Employee;
import model.Manager;
import model.Seller;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

public class CellFillerManagers {
    List<Manager> managers = new ArrayList<>();
    private int rownum = 0;

    public void fillCells(List<Employee> employees, Sheet sheet) {
        for (Employee employee : employees
        ) {
            Manager manager = (Manager) employee;
            Row row1 = sheet.createRow(++rownum);
            row1.createCell(0).setCellValue(manager.getId());
            row1.createCell(1).setCellValue(manager.getFirstName());
            row1.createCell(2).setCellValue(manager.getLastName());
            row1.createCell(3).setCellValue(manager.getNumberOfSellers());
            row1.createCell(4).setCellValue(manager.getCountry());
        }
    }
}
