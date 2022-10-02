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
 */
public class ArrayDemo {

    public static void main(String[] args) {

        int[] number;
        number = new int[5];

        String[] name = new String[6];
        int sumNum = 0;

        number[0] = 10;
        number[1] = 20;
        number[2] = 30;
        number[3] = 40;
        number[4] = 50;

        System.out.println("number[0] " + number[0]);
        System.out.println("number[1] " + number[1]);
        System.out.println("number[2] " + number[2]);
        System.out.println("number[3] " + number[3]);
        System.out.println("number[4] " + number[4]);

        sumNum = number[0] + number[1] + number[2] + number[3] + number[4];
        System.out.println("Total is : " + sumNum);

        name[0] = "Rafa";
        name[1] = "Kalpo";
        name[2] = "Safaa";
        name[3] = "Nahi";
        name[4] = "Abdullah";
        name[5] = "Taimur";

        System.out.println("Name[0] " + name[0]);
        System.out.println("Name[1] " + name[1]);
        System.out.println("Name[2] " + name[2]);
        System.out.println("Name[3] " + name[3]);
        System.out.println("Name[4] " + name[4]);
        
        Scanner input = new Scanner(System.in);
        

    }
}
