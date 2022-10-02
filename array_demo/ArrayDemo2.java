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
public class ArrayDemo2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double[] numbers = new double[5];
        double sum = 0;

        System.out.print("Please Enter 5 numbers :");
        //numbers[0] = input.nextDouble();
        //numbers[1] = input.nextDouble();
        //numbers[2] = input.nextDouble();
        //numbers[3] = input.nextDouble();
        //numbers[4] = input.nextDouble();

        for (int i = 0; i < numbers.length; i++) { //we can use array.length instead of 5 
            numbers[i] = input.nextDouble();
            //System.out.println("Index Value print using Loop :"+numbers[i]);
            //sum = sum + numbers[i];
        }
        //System.out.println("Sum using Loop is :"+sum);

        //sum without loop 
        //sum = numbers[0] + numbers[1] + numbers[2] + numbers[3] + numbers[4];
        //System.out.println("Usign Normal Sum method :"+sum);
        //sum using loop.
        sum = 0; //again we can set sum=0; other wise it will add with old some
        for (int i = 0; i < numbers.length; i++) {
            sum = sum + numbers[i];
        }
        System.out.println("Using Loop Sum is: " + sum);

        double avg = sum / numbers.length; //sum/5;
        System.out.println("Average is:" + avg);

        double max = numbers[0];
        double min = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            if (max < numbers[i]) {
                max = numbers[i];
            }
            if (min > numbers[i]) {
                min = numbers[i];
            }
        }
        System.out.println("Maximum is :" + max);
        System.out.println("Minimum is :" + min);
    }

}
