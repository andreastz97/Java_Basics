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
    private static final FileReader FILE_READER = new FileReader();
    private static final EmployeeParser PARSER = new EmployeeParser();
    private static final ExporterFactory EXPORTER = new ExporterFactory();

    public static void main(String[] args) throws IOException {
        String filePath = args[0];
        String role = args[1];
        OutComeType outComeType = OutComeType.valueOf(args[2]);

        validateArgs(filePath, role, outComeType, args);
        List<String> lines = FILE_READER.read(filePath);

        List<Employee> employeesList = PARSER.parse(lines, Role.valueOf(role));
        
        //todo rename
        Exporter exporter1 = EXPORTER.getExporter(outComeType);

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