package parser;

import model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

public class EmployeeParser {

    public static final String COMMA = ",";

    public List<Employee> parse(List<String> lines, Role role) {
        List<Employee> listOfEmployee = new ArrayList<>();

        if (role == Role.SELLER) {
            listOfEmployee = parseSeller(lines);
        } else if (role == Role.MANAGER) {
            listOfEmployee = parseManager(lines);
        }

        return listOfEmployee;
    }

    public List<Employee> parseManager(List<String> lines) {
        List<Employee> listOfManagers = new ArrayList<>();
        for (String line : lines) {
            String[] arrayStringsManagers = line.split(COMMA);
            if (arrayStringsManagers[3].equals(Role.MANAGER.toString())) {
                if (arrayStringsManagers[0].isEmpty()){
                    arrayStringsManagers[0] = UUID.randomUUID().toString();
                }
                listOfManagers.add(new Manager(arrayStringsManagers[0], arrayStringsManagers[1], arrayStringsManagers[2], Integer.parseInt(arrayStringsManagers[4]), arrayStringsManagers[5])); /*arrayStringsManagers[5],Integer.parseInt(arrayStringsManagers[4])*/;
            }
        }
        return listOfManagers;
    }
    public List<Employee> parseSeller(List<String> lines) {
        List<Employee> listOfSellers = new ArrayList<>();
        for (String line : lines) {
            String[] arrayStringsSellers = line.split(COMMA);
            if (arrayStringsSellers[3].equals(Role.SELLER.toString())) {
                if (arrayStringsSellers[0].isEmpty()) {
                    arrayStringsSellers[0] = UUID.randomUUID().toString();
                }
                listOfSellers.add(new Seller(arrayStringsSellers[0], arrayStringsSellers[1], arrayStringsSellers[2], arrayStringsSellers[3], Double.parseDouble(arrayStringsSellers[8]), Boolean.parseBoolean(arrayStringsSellers[9])));
            }
        }
        return listOfSellers;
    }
}
