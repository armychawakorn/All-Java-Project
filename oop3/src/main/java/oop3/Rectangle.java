package oop3;

public class Rectangle extends Shape {
    private String Color;
    public Rectangle(int width, int height, String Color) {
        this.width = width;
        this.height = height;
        this.Color = Color;
    }
    public String getColor() {
        return this.Color;
    }
    public void setColor(String color) {
        this.Color = color;
    }
}
