
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */
public class Student { //Copy the constructor value into other object.
    
    int id;
    String name;
    
    Student(){
        
    }
    
    
    Student(int i, String n){
        this.id = i;
        this.name = n;
       
    }
    
//    Student(Student s){
//        this.id = s.id;
//        this.name = s.name;
//        
//    }
    
    void display(){
        System.out.println(id+" "+name);
    }
    
    
    
    
    
    public static void main(String[] args) {
        Student st = new Student(1, "Taimur");
        st.display();
        //Student st2 = new Student(st); // st2 objects value is equal to st.
        Student st2 = new Student();
        st2.id = st.id;
        st2.name = st.name;
        
        st2.display();
    }
}
