
package abstraction;

public class Triangle extends Shape{
    //dim1, dim2,
    Triangle(double dim1,double dim2){
        super(dim1,dim2);
    }
    
    void calculateArea(){
        double result = (.5*dim1*dim2);
        System.out.println("Triangle Area "+result);
    }
}
