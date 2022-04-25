import model.Employee;
import model.Manager;
import model.Seller;
import reader.ReadFile;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;



public class DemoMain {
    //todo read custom exceptions


    public static void main(String[] args)  {

//        List<String> lines = Files.readAllLines(Path.of("awd"));
        //Seller S1 = new Seller("Thess" , 15 , true);
        Employee E1 = new Employee("1233124" , "Andreas" , "Tzioukalias");
        //Manager M1 = new Manager("fdsf"

        //Employee E2 = new Employee("" , "Andreas" , "Tzioukalias");

        //ToXML F1 = new ToXML();
        // ReadTxtFile F2 = new ReadTxtFile();
        //F2.ReadFile();
        //read file into stream, try-with-resources

        //F1.begin();
        //F1.openXml();

        Employee S1 = new Seller("213","fdasfsdfwe","wefwfe","Thess",13,true);
        Employee M1 = new Manager("232","Andeas","Tzioukalias","Thess",54);
        ////ReadFile.Reader();

        //List <Employee>  myList =  new List<>;
        //List<Employee> mylist = new <Employee>();

        List<String> myList = new ArrayList<String>();

        Scanner myObj = new Scanner(System.in);  // Create a Scanner object
        System.out.println("Enter path of text , export format , role");
        System.out.println(M1);
        ReadFile path = new ReadFile();


                //list stream

    //from string to object -> parsing
    }}