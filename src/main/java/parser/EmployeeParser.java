package parser;

import model.Employee;
import model.Manager;
import model.Role;
import model.Seller;

import java.util.ArrayList;
import java.util.EnumMap;
import java.util.List;

import static java.lang.Boolean.parseBoolean;
import static java.lang.Double.parseDouble;
import static java.lang.Integer.parseInt;

public class EmployeeParser {

      public List<Employee> parse(List<String> lines, Role role) {
          List<Employee> listOfEmployee = new ArrayList<>();
        if (role == Role.SELLER){
            listOfEmployee = parseSeller(lines);
        }
        if (role == Role.MANAGER){
            listOfEmployee = parseManager(lines);
        }
    return listOfEmployee;
        //parseManager(lines);
        //parseSeller(lines);
    }


    public List<Employee> parseManager(List<String> lines) {
        List<Employee> listOfManagers = new ArrayList<>();


        for (String line : lines) {
            String[] arrayStrings = line.split(",");
            if (arrayStrings[3].equals("MANAGER")){
            listOfManagers.add(new Manager(arrayStrings[0], arrayStrings[1], arrayStrings[2]  , Integer.parseInt(arrayStrings[4]),arrayStrings[5])); /*arrayStrings[5],Integer.parseInt(arrayStrings[4])*/;

        }
        }



        return listOfManagers;

    }


    public List<Employee> parseSeller(List<String> lines) {

       List<Employee> listOfSellers =new ArrayList<>();

       //List<Seller> listOfSellers  = (List<Seller>) new Employee();
        for (String line : lines) {
            String[] arrayStringsSellers;
            arrayStringsSellers = line.split(",");
            if (arrayStringsSellers[3].equals("SELLER")){

            listOfSellers.add(new Seller(arrayStringsSellers[0], arrayStringsSellers[1], arrayStringsSellers[2],arrayStringsSellers[3],Double.parseDouble(arrayStringsSellers[8]),  Boolean.parseBoolean(arrayStringsSellers[9]) ));

            }}




        return listOfSellers;
    }


}
