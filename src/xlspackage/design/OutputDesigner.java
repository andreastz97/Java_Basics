package xlspackage.design;

import org.apache.poi.ss.usermodel.Sheet;

public class OutputDesigner {
    public void design(Sheet sheet) {
        sheet.setColumnWidth(0, 5000);
        sheet.setColumnWidth(1, 6000);
        sheet.setColumnWidth(2, 6000);
        sheet.setColumnWidth(3, 6000);
        sheet.setColumnWidth(4, 6000);
        sheet.setColumnWidth(5, 6000);
    }
}
