import exporter.Exporter;
import exporter.ExporterFactory;
import model.Employee;
import model.OutComeType;
import model.Role;
import parser.EmployeeParser;
import reader.FileReader;

import java.io.IOException;
import java.util.List;

import static validations.ValidationUtil.*;

public class DemoMain {
    private static FileReader fileReader = new FileReader();
    private static EmployeeParser parser = new EmployeeParser();
    private static ExporterFactory exporter = new ExporterFactory();

    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        String role = args[1];
        String exportFormat = args[2];
        OutComeType outComeType = OutComeType.valueOf(exportFormat);
        //todo merge lns 20-21

        validateArgs(filePath, role, OutComeType.valueOf(exportFormat), args);
        List<String> lines = fileReader.read(filePath);

        List<Employee> employeesList = parser.parse(lines, Role.valueOf(role));

        Exporter exporter1 = exporter.getExporter(outComeType);

        exporter1.export(employeesList);
    }

    // 700 + 120 coupons + 30 internet
    public static void validateArgs(String filePath, String role, OutComeType exportFormat, String[] args) {
        checkIfEmpty(args);
        checkSizeOfParameters(args);
        checkFilePath(filePath);
        checkOutCome(exportFormat);
        checkRole(role);
    }
}