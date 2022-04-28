package model;

public class Seller extends Employee {
    String city;
    double averageSales;
    boolean active;


    public Seller(String ID,String firstName , String lastName,String city, double averageSales, boolean active) {
        super(ID,firstName,lastName);
        this.city = city;
        this.averageSales = averageSales;
        this.active = active;

    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getAverageSales() {
        return averageSales;
    }

    public void setAverageSales(double averageSales) {
        this.averageSales = averageSales;
    }

    public boolean isActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }
}
