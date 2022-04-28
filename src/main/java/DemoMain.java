//import model.Employee;
//import parser.Parser;
//import reader.FileReader;
//import validations.ValidationUtil;
//import java.util.List;

import validations.ValidationUtil;

public class DemoMain {


    public static void main(String[] args) {
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
       ValidationUtil checker = new ValidationUtil();
       checker.checkSizeOfParameters(args);
        checker.checkIfEmpty(args);
        checker.checkFilePath(args);
        checker.checkOutCome(args);
        checker.checkRole(args);
        checker.checkSizeOfParameters(args);
    }
}