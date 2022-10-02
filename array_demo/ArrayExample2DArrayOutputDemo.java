/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_demo;

import java.util.Scanner;

/**
 *
 * @author Md. Talal Wasim 
 * https://github.com/mdtalalwasim
 * 
 * OUTPUT Will Be Like This:
 *    0  
 *    1  2  
 *    3  4 5 
 *    7  8  9 10
 *    
 * 
 * 
 */
public class ArrayExample2DArrayOutputDemo {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int number[][] = new int[5][];
        int element=0; 
        number[0] = new int [1];
        number[1] = new int [2];
        number[2] = new int [3];
        number[3] = new int [4];
        number[4] = new int [5];
        
        for (int i = 0; i < 5; i++) { //i = row and j=col
            for (int j = 0; j < i+1; j++) {
                number[i][j] = element;
                element++;
            }
        }
        for (int i = 0; i < 5; i++) { //i = row and j=col
            for (int j = 0; j < i+1; j++) {
                System.out.print(" "+number[i][j]);
            }
            System.out.println();
        }
        
        
        System.out.println("********************************");
        
        
        
        
        
        
    }
    
}
