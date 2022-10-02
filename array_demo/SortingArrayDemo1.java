
package array_demo;

import java.util.Arrays;

/**
 *
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
public class SortingArrayDemo1 {
    
    public static int[] get(){
        System.out.println("Inside get() :");
        return new int[]{10, 20, 70,80,100, 5, 25,15};
    }
    public static void main(String[] args) {
        int numbers[] = {1, -2, 5, 6 , 10 ,50, 20, 15};
        
        System.out.println("Origianl Array : ");
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" "+numbers[i]);
        }
        Arrays.sort(numbers);
        System.out.println();
        
        System.out.println("Ascending Order: ");
        
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(" "+numbers[i]);
        }
        
        //
        //Print array element in Descending Order.
        //for print descending order.. you must first sort the array in ascending order. 
        System.out.println();
        System.out.println("Descending Order :");
        for (int i = numbers.length-1; i >=0; i--) {//array length is 8. but index will(0 to 7), so array.length-1
            System.out.print(" "+numbers[i]); 
        }
        System.out.println();
        
        //int myIntArray[] = new int[5];
        int myIntArray[] ={1,5,3,10,8};
        
        for (int element:myIntArray) {
            System.out.print(" "+element);
        }
        
        System.out.println();
        int newArray[] = get();
        //Arrays.sort(newArray);//array sorting inside get method.
        for (int i:newArray) {
            System.out.print(" "+i);
        }
        
        System.out.println("-------------------------");
        int multiDimesional[][] = {{1,2,3},{4,5,6},{7,8,9}};
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+multiDimesional[row][col]);
            }
            System.out.println();
        }
    }
}
