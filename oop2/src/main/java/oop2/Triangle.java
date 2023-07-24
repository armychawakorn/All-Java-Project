package oop2;

public class Triangle {
    private double base;
    private double height;

    public void setBase(double base) {
        this.base = base;
    }
    public void setHeight(double height) {
        this.height = height;
    }
    public double getArea(){
        return (this.base * this.height) * 1/2;
    }
}
