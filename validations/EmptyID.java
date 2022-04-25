package validations;


import exceptions.EmptyIdException;

public class EmptyID extends EmptyIdException {
    public EmptyID(String message) {
        super(message);
    }

    public void validID(String id) {

    }
}
