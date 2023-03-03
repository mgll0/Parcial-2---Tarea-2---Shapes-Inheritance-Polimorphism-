package oop.parcial2.shapes;

public class Triangle extends Shape {
    private double height;
    private double base;
    public Triangle(){
        super("Triangulo");     //super: Llama al constructor de la clase padre
    }
    public Triangle(double height, double base){
        this();
        this.height = height;
        this.base = base;
    }

    public double getArea(){
        return (base * height) / 2;
    }
    public double getPerimeter(){
        return 999;
    }

    public double getHeight() {
        return height;
    }
    public int getSidesCount(){
        return 3;
    }
    public void setHeight(double height) {
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }
    public String toString() {
        return "▲";
    }
}
