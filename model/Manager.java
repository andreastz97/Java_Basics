package model;

public class Manager extends Employee{
    int numberOfSellers;
    String country;

    public Manager() {
    }

    public Manager(int numberOfSellers, String country) {
        this.numberOfSellers = numberOfSellers;
        this.country = country;
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
