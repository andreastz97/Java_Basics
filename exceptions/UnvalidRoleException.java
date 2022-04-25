package exceptions;


public class UnvalidRoleException extends RuntimeException {
    public void  IOException(String message){
        System.out.println("False role parameter , Please type 'Manager' or 'Seller' ");
    }

}
