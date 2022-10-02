/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package array_demo;

/**
 *
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
public class EnhancedForLoopDemo {

    public static void main(String[] args) {

        String[] name = new String[6]; //array declaration and Initialization with value.
        name[0] = "Rafa";
        name[1] = "Safaa";
        name[2] = "Kalpo";
        name[3] = "Abdullah";
        name[4] = "Taimur";
        name[5] = "Nahi";

        String[] name2 = {"A", "B", "C", "D", "E"}; //array declaration and Initialization with value

        for (String s : name) {
            System.out.println(s);
        }

        int sum = 0;
        int[] num = {10, 20, 30, 40, 50, 60, 70};

        for (int n : num) {
            sum = sum + n;
        }
        System.out.println(sum);
    }
}
