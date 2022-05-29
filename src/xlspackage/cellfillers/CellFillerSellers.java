package xlspackage.cellfillers;

import model.Seller;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;

import java.util.ArrayList;
import java.util.List;

public class CellFillerSellers {
    public void fillCells(List employees, Sheet sheet) {
        List<Seller> sellers = new ArrayList<>();
        for (Object seller : employees
        ) {
            sellers.add((Seller) seller);
        }
        int rownum = 0;
        for (Seller seller : sellers
        ) {
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
