package model;

import java.util.List;

public class Manager extends Employee {

    int numberOfSellers;
    String country;

    public Manager(String id, String firstName, String lastName) {

        super(id, firstName, lastName);
    }

    public Manager(String id, String firstName, String lastName, int numberOfSellers, String country) {
        super(id, firstName, lastName);
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

    @Override
    public String toString() {
        return super.toString() +
                " numberOfSellers = " + numberOfSellers + +'\'' +
                ", country = '" + country + '\n'
                ;
    }
    public List<Manager> getListManagers(List<Manager> managers){
        return managers;
    }
}
