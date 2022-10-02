/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatopiccoverd;

/**
 *
 * @author Wasim Ahmed
 */
public class ParameterizedConstructorExample {
    int id;
    String name;

    public ParameterizedConstructorExample(int id, String name) {
        this.id = id;
        this.name = name;
    }
    
    void display(){
        System.out.println(id+" "+name);
}
    
    
    
    public static void main(String[] args) {
        ParameterizedConstructorExample obj1 = new ParameterizedConstructorExample(5, "Wasim");
        obj1.display();
    }
}
