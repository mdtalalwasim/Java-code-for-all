
package javabeginner;

/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Scanner;

public class TriangleJava {
    public static void main(String[] args) {
    //Triangle t = new Triangle();
        double base;
        double height;
        double area;
        
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter base and Height for Triangle : ");
        base = scan.nextDouble();
        height= scan.nextDouble();
        area = 0.5*base*height;
        
        System.out.println("Area of Triangle is " + area );
        
        
        double radius;
        System.out.println("Enter the radius of Circle---");
        Scanner scan2 = new Scanner(System.in);
        radius = scan2.nextDouble();
        double circleRadius = 3.1416 * radius *radius;
        System.out.println("Area of Circle is : "+ circleRadius);
                
    }
    
    
    
}
