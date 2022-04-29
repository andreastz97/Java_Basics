//import model.Employee;
//import parser.Parser;
//import reader.FileReader;
//import validations.ValidationUtil;
//import java.util.List;

import exceptions.NoArgsException;
import validations.ValidationUtil;

import java.io.File;

public class DemoMain {


    public static void main(String[] args) {
        //test
        //System.out.println(args[0]);

        if( args.length == 0 ) {
            throw new NoArgsException();
        }
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

       ValidationUtil checker = new ValidationUtil();
        checker.checkIfEmpty(args);
        checker.checkSizeOfParameters(args);
        checker.checkFilePath(String.valueOf(path));
        checker.checkOutCome(args);
        checker.checkRole(args);
        checker.checkSizeOfParameters(args);
    }
}