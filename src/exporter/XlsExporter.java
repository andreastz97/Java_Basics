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
import java.util.List;

public class XlsExporter implements Exporter {
    private static final String[] COLUMN_HEADINGS_MANAGERS = {"ID", "First Name", "Last Name", "Number Of Sellers", "Country"};
    private static final String[] COLUMN_HEADINGS_SELLERS = {"ID", "First Name", "Last Name", "City", "Average Sales", "Active"};
    private static final String FILE_PATH = "NewFile2.xls";
    private static final String SHEET_NAME = "Employees";

    public void export(List<Employee> employees) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet(SHEET_NAME);
        OutputDesigner design = new OutputDesigner();
        HeadFontDesigner headerStyle = new HeadFontDesigner();
        design.design(sheet);

        if (!employees.isEmpty() && employees.get(0) instanceof Manager)
            try (FileOutputStream fileOutput = new FileOutputStream(FILE_PATH)) {
                headerStyle.headDesign(COLUMN_HEADINGS_MANAGERS, sheet);
                CellFillerManagers cellFillerManagers = new CellFillerManagers();
                cellFillerManagers.fillCells(employees, sheet);
                workbook.write(fileOutput);
            }
        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            try (FileOutputStream fileOutput = new FileOutputStream(FILE_PATH)) {
                headerStyle.headDesign(COLUMN_HEADINGS_SELLERS, sheet);
                CellFillerSellers cellFillerSellers = new CellFillerSellers();
                cellFillerSellers.fillCells(employees, sheet);
                workbook.write(fileOutput);
            }
        }
    }
}
