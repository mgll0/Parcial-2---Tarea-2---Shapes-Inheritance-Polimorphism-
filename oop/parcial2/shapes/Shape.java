package oop.parcial2.shapes;

public abstract class Shape {   //abstract metodos sin cuerpos
    //Clase abstracta: puede o no tener metodos abstractos
    //No puede ser instaciada (solo puede ser papa)
    //Las clases hijas estan obligadas a usar todos los metodos abstractos

    //Clase concreta: clase completamente definida (las normales)
    private String name; //Todas las hijas tienen este atributo
    private int sidescount;

    public Shape(String name){
        this.name = name;
    }
    public abstract double getArea();
    public abstract double getPerimeter();

    public String getName(){
        return name;
    }
    public abstract int getSidesCount();
}
