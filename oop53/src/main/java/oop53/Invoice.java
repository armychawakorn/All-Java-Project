package oop53;

public class Invoice {
    private String id;
    private Customer customer;
    private double totalPrice;
    public Invoice(String id, Customer customer, double totalPrice) {
        this.id = id;
        this.customer = customer;
        this.totalPrice = totalPrice;
    }
    public void printInvoice() {
        System.out.println("Invoice ID: " + id);
        System.out.println("Customer: " + customer.getFullName());
        System.out.println("Type: " + customer.getType());
        System.out.println("Total price: " + totalPrice);
    }
}
