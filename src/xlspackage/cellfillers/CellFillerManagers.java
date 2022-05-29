package xlspackage.cellfillers;

import model.Manager;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.List;

public class CellFillerManagers {
    List<Manager> managers = new ArrayList<>();

    public void fillCells(List employees, Sheet sheet) {
        for (Object manager : employees) {
            managers.add((Manager) manager);
        }
        int rownum = 0;
        for (Manager manager : managers
        ) {
            Row row1 = sheet.createRow(++rownum);
            row1.createCell(0).setCellValue(manager.getId());
            row1.createCell(1).setCellValue(manager.getFirstName());
            row1.createCell(2).setCellValue(manager.getLastName());
            row1.createCell(3).setCellValue(manager.getNumberOfSellers());
            row1.createCell(4).setCellValue(manager.getCountry());
        }
    }
}
