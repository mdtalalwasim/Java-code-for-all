
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */


class Operation{
    int square(int n){
        return n * n;
    }
}
public class Aggregation_Demo_1 {
    //public static void main(String[] args) {
        Operation op; //aggregation 
    double pi = 3.1416;
    
    double area(int radius){
        op = new Operation();
        int rsquare = op.square(radius); //code reusability(i.e delegate the method call)
        return (pi * rsquare);
    }
    
    public static void main(String args[]){  
    Aggregation_Demo_1 circle=new Aggregation_Demo_1();  
    double result=circle.area(5);  
    System.out.println(result);  
 }  
    //}
}
