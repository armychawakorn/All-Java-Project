package oop3;

public class Shape {
    protected int width;
    protected int height;
    public Shape(){
        this.width = 0;
        this.height = 0;
    }
    public Shape(int width, int height) {
        this.width = width;
        this.height = height;
    }
    public int getWidth(){
        return this.width;
    }
    public void setWidth(int width){
        this.width = width;
    }
    public int getHeight(){
        return this.height;
    }
    public void setHeight(int height){
        this.height = height;
    }
    public double calculateArea(){
        return this.width * this.height;
    }
}
