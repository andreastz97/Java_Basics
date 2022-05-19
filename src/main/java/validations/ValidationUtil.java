package validations;


import exceptions.*;
import model.OutComeType;

import java.nio.file.Files;
import java.nio.file.Path;

import static model.Role.MANAGER;
import static model.Role.SELLER;

public class ValidationUtil {
    public static void checkFilePath(String filePath) {
        if (!Files.exists(Path.of(filePath))) {
            throw new InvalidPathException();
        }
    }

    public static void checkIfEmpty(String[] args) {
        if (args.length == 0) {
            throw new NoArgsException();
        }
    }

    public static void checkSizeOfParameters(String[] args) {
        if (args.length > 3) {
            throw new FalseParametersException();
        }
    }

    public static void checkRole(String role) {

        if (!role.equals(SELLER.name()) && !role.equals(MANAGER.name())) {
            throw new InvalidRoleException();
        }

    }

    public static void checkOutCome(OutComeType exportFormat) {
        if ((exportFormat != OutComeType.XLS) && (exportFormat != OutComeType.XML) && (exportFormat != OutComeType.JSON)) {
            //convert to enum
            throw new InvalidOutComeException();
        }
    }
}
