package validations;

import model.Role;

public class ValidRole {

    public static void IsValid(Role a){
        if (a != Role.SELLER || a!= Role.MANAGER )
            return;
    }
}
