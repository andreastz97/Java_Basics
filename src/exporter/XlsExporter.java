package exporter;

import xlspackage.cellfillers.CellFillerManagers;
import xlspackage.cellfillers.CellFillerSellers;
import xlspackage.design.HeadFontDesign;
import xlspackage.design.OutputDesign;
import model.Employee;
import model.Manager;
import model.Seller;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.util.ArrayList;
import java.util.List;

public class XlsExporter implements Exporter {

    public void export(List<Employee> employees) {
        List<Manager> managers = new ArrayList<>();
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("Employees");
        OutputDesign design = new OutputDesign();
        HeadFontDesign headerStyle = new HeadFontDesign();

        if (!employees.isEmpty() && employees.get(0) instanceof Manager) {

            try (FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");) {
                design.design(sheet);
                String[] columnHeadings = {"ID", "First Name", "Last Name", "Number Of Sellers", "Country"};
                headerStyle.headDesign(columnHeadings, sheet);
                CellFillerManagers cellFillerManagers = new CellFillerManagers();
                cellFillerManagers.fillCells(employees, sheet);

                workbook.write(fileOutput);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
        if (!employees.isEmpty() && employees.get(0) instanceof Seller) {
            try (FileOutputStream fileOutput = new FileOutputStream("NewFile2.xls");) {
                design.design(sheet);
                String[] columnHeadings = {"ID", "First Name", "Last Name", "City", "Average Sales", "Active"};
                headerStyle.headDesign(columnHeadings, sheet);

                CellFillerSellers cellFillerSellers = new CellFillerSellers();
                cellFillerSellers.fillCells(employees, sheet);

                workbook.write(fileOutput);
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
