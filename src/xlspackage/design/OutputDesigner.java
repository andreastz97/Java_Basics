package xlspackage.design;

import org.apache.poi.ss.usermodel.Sheet;

public class OutputDesign {
    public void design(Sheet sheet) {
        sheet.setColumnWidth(0, 5000);
        sheet.setColumnWidth(1, 4500);
        sheet.setColumnWidth(2, 4500);
        sheet.setColumnWidth(3, 4000);
        sheet.setColumnWidth(4, 4500);
        sheet.setColumnWidth(5, 4500);
    }
}
