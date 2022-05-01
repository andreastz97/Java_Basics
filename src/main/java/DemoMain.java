

import model.Employee;
import model.Manager;
import model.Role;
import model.Seller;
import parser.EmployeeParser;
import reader.FileReader;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import static validations.ValidationUtil.*;

public class DemoMain {


    public static void main(String[] args) throws IOException {

        String filePath = args[0];
        String role = args[1];
        String exportFormat = args[2];

        validateArgs(filePath, role, exportFormat, args);
        //validate args
        FileReader fileReader = new FileReader();

        List<String> lines = fileReader.read(filePath);
        EmployeeParser parser = new EmployeeParser();


       List<Seller> sellers= new ArrayList<>();
       List<Manager> managers = new ArrayList<>();

       sellers = parser.parseSeller(lines);
       managers = parser.parseManager(lines);
        System.out.println(sellers);





    }
    //

    public static void validateArgs(String filePath, String role, String exportFormat, String[] args) {

        checkIfEmpty(args);
        checkSizeOfParameters(args);
        checkFilePath(filePath);
        checkOutCome(exportFormat);
        checkRole(role);
    }
}