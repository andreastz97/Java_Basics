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
    //todo make final
    private static FileReader fileReader = new FileReader();
    private static EmployeeParser parser = new EmployeeParser();
    private static ExporterFactory exporter = new ExporterFactory();

    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        String role = args[1];
        OutComeType outComeType = OutComeType.valueOf(args[2]);

        validateArgs(filePath, role, outComeType, args);
        List<String> lines = fileReader.read(filePath);

        List<Employee> employeesList = parser.parse(lines, Role.valueOf(role));

        Exporter exporter1 = exporter.getExporter(outComeType);

        exporter1.export(employeesList);
    }

    public static void validateArgs(String filePath, String role, OutComeType exportFormat, String[] args) {
        checkIfEmpty(args);
        checkSizeOfParameters(args);
        checkFilePath(filePath);
        checkOutCome(exportFormat);
        checkRole(role);
    }
}