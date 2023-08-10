package oop5;

public class SmartPhone extends Phone{
    private String cpu;
    public SmartPhone(String model, int price, String cpu){
        super(model, price);
        this.cpu = cpu;
    }
    @Override public float getDiscount(){
        return this.price * 0.85f;
    }
    public float paymentPerMonth(){
        return this.price / 6;
    }
    public float paymentPerMonth(int month){
        return this.price / month;
    }
    public void print(){
        super.print();
        System.out.println("CPU: " + this.cpu);
        System.out.println("Pay per 6 month: " + this.paymentPerMonth());
    }
}
