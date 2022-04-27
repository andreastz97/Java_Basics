import model.Employee;
import parser.Parser;
import reader.FileReader;

import java.util.List;

public class DemoMain {
    //todo read custom exceptions


    public static void main(String[] args) {
        validateArgs(args);
        FileReader fileReader = new FileReader();
        Parser parser = new Parser();

        //validate args



//        List<String> lines = fileReader.read();

        //1,George,Kokkinou
//        List<Employee> employees = parser.parse(lines);




    }

    private static void validateArgs(String[] args) {
        //call validationUtils methods
    }
}