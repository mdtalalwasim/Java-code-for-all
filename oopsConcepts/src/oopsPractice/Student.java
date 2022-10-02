package oopsPractice;

public class Student {
    private int studentId;
    private String studentName;
    private String studentCity;


    //-----------------------------------

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getStudentName() {
        return studentName;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public String getStudentCity() {
        return studentCity;
    }

    public void setStudentCity(String studentCity) {
        this.studentCity = studentCity;
    }

    //------------------------------------
   /*
    //getter
    public int getStudentId(){
        return this.studentId;
    }

    public String getStudentName(){
        return this.studentName;
    }

    public String getStudentCity(){
        return this.studentCity;
    }

    //setter

    public void setStudentId(int studentId){
        if (studentId<=0){
            throw new IllegalArgumentException("Ivalid Input");
        }
        this.studentId = studentId;
    }

    public void setStudentName(String name){
        this.studentName = name;
    }
    public void setStudentCity(String city){
        this.studentCity = city;
    }
*/

    public void study(){
        System.out.println(studentName+ " Studying...");

    }



    public void showFullDetails(){
        System.out.println("My name is : "+studentName);
        System.out.println("My student Id is : "+studentId);
        System.out.println("My City is : "+studentCity);

    }
}
