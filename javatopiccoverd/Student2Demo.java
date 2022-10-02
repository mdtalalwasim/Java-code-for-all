
package javatopiccoverd;



class StudentTest{
    int id;
    String name;
    
    void setInfo(int id, String name){
        this.id = id;
        this.name = name;
        
    }
    
    void getInfo(){
        System.out.println(id+" "+name);
    }
    
}

//public class Student2Demo {
//    public static void main(String[] args) {
//        StudentTest std1 = new StudentTest();
//        //System.out.println(" "+std1.name);
//        std1.setInfo(1, "Taimur");
//        std1.getInfo();
//        
//    }
//}
