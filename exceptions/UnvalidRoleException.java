package exceptions;


public class UnvalidRoleException extends RuntimeException {
    public String message;

    public UnvalidRoleException(String message) {
        this.message = message;
    }

    @Override
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
