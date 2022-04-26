package model;

public class Manager extends Employee{

    int numberOfSellers;
    String country;

    public Manager(String ID,String firstName,String lastName) {

        super(ID,firstName,lastName);
    }

    public Manager(String ID,String firstName,String lastName, String country,int numberOfSellers) {
        super(ID,firstName,lastName);
        this.country = country;
        this.numberOfSellers = numberOfSellers;
    }

    public int getNumberOfSellers() {
        return numberOfSellers;
    }

    public void setNumberOfSellers(int numberOfSellers) {
        this.numberOfSellers = numberOfSellers;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
