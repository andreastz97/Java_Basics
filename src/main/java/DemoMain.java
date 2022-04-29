//import model.Employee;
//import parser.Parser;
//import reader.FileReader;
//import validations.ValidationUtil;
//import java.util.List;

import exceptions.NoArgsException;
import validations.ValidationUtil;

import java.io.File;

import static validations.ValidationUtil.*;

public class DemoMain {


    public static void main(String[] args) {
        //test
        //System.out.println(args[0]);


        validateArgs(args);
        //FileReader fileReader = new FileReader();
        // Parser parser = new Parser();
        System.out.println("OLA KALA");

        //validate args


//        List<String> lines = fileReader.read();

        //1,George,Kokkinou
//        List<Employee> employees = parser.parse(lines);


    }

    public static void validateArgs(String[] args) {
        //call validationUtils methods
        //if( args.length == 0 ) {
        // System.out.println("NO ARGS BRO WHY?");
        //System.exit(0);
        //}
        File path = new File(args[0]);

        //ValidationUtil checker = new ValidationUtil();
        checkIfEmpty(args);
        checkSizeOfParameters(args);
        checkFilePath(String.valueOf(path));
        checkOutCome(args);
        checkRole(args);
        checkSizeOfParameters(args);
    }
}