
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */
public class Student3 {
    
    int roll;
    String name;
    float fees;
    
    /*Student3(int roll, String name, float fees){ 
    //if we can't use this keyword, Compiler will get confused,
    //means complier will not identify the value of roll, name , fees!
    //compiler will set all of these member's value to default value(data type wise)
    //because all member name and parameters name is same... thats why compiler will confused.  
    //if we change Constructors parameters name than the code will run properly.
    //if you dont want to change the parameters name, then just put this keyword. then the problem will solve.
    //If local variables(formal arguments) and instance variables are different, there is no need to use this keyword
    
        roll = roll;
        name = name;
        fees = fees;
    }*/
    Student3(int roll, String name, float fees){
        this.roll = roll;
        this.name = name;
        this.fees = fees;
    }
    
    void display(){
        System.out.println(roll+" "+name+ " "+fees);
    }
    
    public static void main(String[] args) {
        Student3 s1 = new Student3(111,"Wasim", 1000);
        s1.display();
    }
}
