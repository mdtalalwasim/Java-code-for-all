
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */
public class Student1 {//Example of static method
    
    int roll;
    String name;
    static String department = "CSE"; //depart value is CSE
    
    public static void change(){
        department = "IT"; //change the department value.
    }
    
    Student1(int r, String n){
        this.roll = r;
        this.name = n;
    }
    void display(){
         System.out.println(roll+" "+name+" "+department);
    }
    
    public static void main(String[] args) {
        
        Student1 st3 = new Student1(103, "Abdullah");//before change the value of static members.
        st3.display();
        
        Student1.change(); //change the static member value. CSE to IT.
        
        Student1 s1 = new Student1(101, "Wasim");
        Student1 s2 = new Student1(102, "Taimur");
        s1.display();
        s2.display();
    }
}
