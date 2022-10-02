
package javatopiccoverd;

/**
 *
 * @author Md. Talal Wasim
 */

class Address{
    String city, pinCode, country;

    public Address(String city, String pinCode, String country) {
        this.city = city;
        this.pinCode = pinCode;
        this.country = country;
    }
    
}


public class Aggregation_Demo_2 {//Employee Class
    //Emp class
    int id;
    String name;
    Address address;//aggregation
    
    //employee class constructor//Aggregation_Demo_2 Class is Emp class.

    public Aggregation_Demo_2(int id, String name, Address address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }
    void display(){
        System.out.println(id + " "+name);
        System.out.println(address.city + " "+address.pinCode+" "+address.country);
    }
    
    public static void main(String[] args) {
        
        //Address Class Obj creation....
        Address addressObj1 = new Address("Dhaka", "1229", "Bangladesh");
        Address addressObj2 = new Address("Rangpur", "5402", "Bangladesh");
        
        //emp class obj creation...
        Aggregation_Demo_2 employee1 = new Aggregation_Demo_2(1001, "Taimur", addressObj1);
        Aggregation_Demo_2 employee2 = new Aggregation_Demo_2(1005, "Wasim", addressObj2);
        
        //display the value of Objecects
        employee1.display();
        employee2.display();
    }
    
}
