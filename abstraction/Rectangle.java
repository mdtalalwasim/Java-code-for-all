
package abstraction;

public class Rectangle extends Shape{

    //dim1,dim2 comes here
    Rectangle(double dim1, double dim2){
        //this.dim1 = dim1;
        //this.dim2 = dim2;
        super(dim1, dim2);
    }
    
    @Override
    void calculateArea(){
        double result = dim1 * dim2;
        System.out.println("Rectangle Area is :"+result);
    }
    
}
