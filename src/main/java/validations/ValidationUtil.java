package validations;


import exceptions.*;
import model.Employee;
import model.OutComeType;


import java.io.File;

import static model.Role.MANAGER;
import static model.Role.SELLER;

public class ValidationUtil {

    public void checkFilePath(String []args) {
        //File f = new File(filePath);
        if (!args[0].toString().equals("sampleDemoJava.txt")){
            throw new InvalidPathException();
        }

       // if (!f.exists()){ String filePath ,
         //   throw new InvalidPathException();
        //}
        // throw new InvalidPathException();
    }


    public void checkIfEmpty(String[] args) {
        if (args[0] == null) {
            throw new NoArgsException();
        }
    }

    public void checkSizeOfParameters(String[] args) {
        if (args.length > 3)
            throw new FalseParametersException();
    }

    public void checkRole(String[] args) {
        String role = args[1];

        if (!role.equals(SELLER.name()) && !role.equals(MANAGER.name())) {
            throw new InvalidRoleException();
        }

    }


    public void checkOutCome(String[] args) {
        String outcome = args[2];

        if ((!outcome.equals("XSL")) && (!args[2].equals("XML")) && (!args[2].equals("JSON"))) {
        //convert to enum
            throw new InvalidOutComeException();

                }
            }
        }
