package javatopiccoverd;


class Employee{
    int employeeID;
    String employeeName;
    float  employeeSalary;
    
    void setEmployeeInfo(int empId, String empName, float empSal){
         employeeID = empId;
         employeeName = empName;
         employeeSalary = empSal;
    }
    void getEmployeeInfo(){
        System.out.println(employeeID+" "+employeeName+" "+employeeSalary);
    }
}

public class ObjectAndClass_TestEmployee {
    public static void main(String[] args) {
        Employee emp1 = new Employee();
        emp1.setEmployeeInfo(1001, "Md. Talal Wasim", 25500);
        emp1.getEmployeeInfo();
        
        //Get all info from student class... From TestEmployeeClass... 
        StudentTest t1 = new StudentTest();
        t1.setInfo(1, "Taimur Ahmed");
        t1.getInfo();
    }
}
