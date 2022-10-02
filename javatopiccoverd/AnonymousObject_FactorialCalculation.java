
package javatopiccoverd;

public class AnonymousObject_FactorialCalculation {
    
    //int number;
    void calculateFactorial(int num){
       int fact = 1;
        for (int i = 1; i <= num; i++) {
            fact = fact*i;
        }
        System.out.println("Factoril is : "+fact);
        
    }
    
    
    //main method
    public static void main(String[] args) { //main within the Class
        //AnonymousObject_FactorialCalculation obj = new AnonymousObject_FactorialCalculation();
        //obj.calculateFactorial(5);
        new AnonymousObject_FactorialCalculation().calculateFactorial(5); // this is called anonymous objects.
        //without any references of the object we call and calculate the value of factorial.
        //see we are not declare any object like obj1 .. obj2.. obj3.. 
    }
    
}
