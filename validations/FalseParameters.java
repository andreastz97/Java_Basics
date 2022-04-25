package validations;

import reader.ReadFile;
import exceptions.FalseParametersException;
package exceptions;
import java.io.IOException;

public class FalseParameters {
    public static void isEmpty(ReadFile path){
        if (path = ""){
            throw new IOException("no path");
        }
    }


}
