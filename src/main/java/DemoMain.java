

import reader.FileReader;


import static validations.ValidationUtil.*;

public class DemoMain {


    public static void main(String[] args) {

        String filePath = args[0];
        String role = args[1];
        String exportFormat = args[2];


        validateArgs(filePath, role, exportFormat, args);
        //validate args
        FileReader fileReader = new FileReader();
        fileReader.read(filePath);
        //        List<Employee> employees = parser.parse(lines);
    }

    public static void validateArgs(String filePath, String role, String exportFormat, String[] args) {

        checkIfEmpty(args);
        checkSizeOfParameters(args);

        checkFilePath(filePath);
        checkOutCome(exportFormat);
        checkRole(role);
    }
}