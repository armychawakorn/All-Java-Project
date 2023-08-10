package oop5;

public class Phone {
    protected String model;
    protected int price;
    public Phone(){
        this.model = "";
        this.price = 0;
    }
    public Phone(String model, int price){
        this.model = model;
        this.price = price;
    }
    public float getDiscount(){
        return this.price * 0.9f;
    }
    public void print(){
        System.out.println("Phone Model: " + this.model);
        System.out.println("Phone Price: " + this.price);
        System.out.println("Phone Discount: " + this.getDiscount());
    }
}
