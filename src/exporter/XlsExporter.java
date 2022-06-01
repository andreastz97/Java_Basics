package exporter;

import xlspackage.cellfillers.CellFillerManagers;
import xlspackage.cellfillers.CellFillerSellers;
import xlspackage.design.HeadFontDesigner;
import xlspackage.design.OutputDesigner;
import model.Employee;
import model.Manager;
import model.Seller;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class XlsExporter implements Exporter {
    private static final String[] columnHeadingsManagers = {"ID", "First Name", "Last Name", "Number Of Sellers", "Country"};
    private static final String[] columnHeadingsSellers = {"ID", "First Name", "Last Name", "City", "Average Sales", "Active"};
    Workbook workbook = new XSSFWorkbook();
    Sheet sheet = workbook.createSheet("Employees");
    OutputDesigner design = new OutputDesigner();
    HeadFontDesigner headerStyle = new HeadFontDesigner();

    public void export(List<Employee> employees) throws IOException {
        if (!employees.isEmpty() && employees.get(0) instanceof Manager) {
            try (FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");) {
                design.design(sheet);
                headerStyle.headDesign(columnHeadingsManagers, sheet);
                CellFillerManagers cellFillerManagers = new CellFillerManagers();
                cellFillerManagers.fillCells(employees, sheet);
                workbook.write(fileOutput);
            }
        }
        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            try (FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");) {
                design.design(sheet);
                headerStyle.headDesign(columnHeadingsSellers, sheet);
                CellFillerSellers cellFillerSellers = new CellFillerSellers();
                cellFillerSellers.fillCells(employees, sheet);
                workbook.write(fileOutput);
            }
        }
    }
}
