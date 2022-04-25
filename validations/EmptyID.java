package validations;


import exceptions.EmptyIdException;

public class EmptyID extends EmptyIdException {
    public void validID(String id) {
        if (id == "")
            throw new EmptyIdException();
    }
}
