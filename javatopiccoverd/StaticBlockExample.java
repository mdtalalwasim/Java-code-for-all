/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package javatopiccoverd;

/**
 *
 * @author Wasim Ahmed
 */
public class StaticBlockExample{  //Example of static block
  
    static{//static block
      System.out.println("static block is invoked"); //static block will invock before main() method call...
    } 
  
  public static void main(String args[]){ 
      
    System.out.println("Hello main");  //static block will invock before main() method call...
    
  }  
}
