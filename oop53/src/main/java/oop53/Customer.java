package oop53;

public class Customer {
    private String fullName;
    private String type;
    public Customer(String fullName, String type) {
        this.fullName = fullName;
        this.type = type;
    }
    public String getFullName() {
        return this.fullName;
    }
    public String getType() {
        return this.type;
    }
}
