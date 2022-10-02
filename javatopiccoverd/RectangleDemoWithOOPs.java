
package javatopiccoverd;
import java.util.Scanner;

class Rectangle{
    double length;
    double width;
    
    void setArea(double l,double w){
        length = l;
        width = w;
        
    }
    void getArea(){
        System.out.println("Rectangle Area is :"+ (length*width) );
    }
    
}


public class RectangleDemoWithOOPs {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Enter Length and Height of a Rectangle :");
        
        
        Rectangle r1 = new Rectangle(), r2= new Rectangle(); //multiple obj can define in single line followed by comma. 
        r1.setArea(input.nextDouble(), input.nextDouble());
        
        
        r1.getArea();
        
//        r2.setArea(input.nextInt(), input.nextInt());
//        r2.getArea();
        
        
    }
}
