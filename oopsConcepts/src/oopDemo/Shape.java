package oopDemo;

public interface Shape {
    //public static final int i = 34;
    int i = 34;//by default, i -> is public static final
    public final int j =5;
    public static int k = 5;


    //public abstract void calculateArea();
    void calculateArea(int r); //look like normal method! but this method is not a normal method
    //this method is public abstract method by default or without declare it is public abstract method.

    static void cal() {
        System.out.println("I am static method in Interfaces");
    }

}

class Circle implements Shape{
    @Override
    public void calculateArea(int r) {
        System.out.println("Area of Circle is :"+(Math.PI* r * r ));
    }

    public static void main(String[] args) {
        Shape obj = new Circle();
        obj.calculateArea(2);
        Shape.cal();//cal() is static method.
        System.out.println(Shape.i);

    }

    abstract class Rectangle implements Shape{
        //Abstract class can provide the implementation of interface.
        //here, Rectangle is abstract class which provide the implementation of Interface Shape.
    }
}
