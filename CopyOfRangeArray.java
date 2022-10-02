
package javabeginner;
/**
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

import java.util.Arrays;

public class CopyOfRangeArray {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 3, 6, 7, 8, 9, 15};
        int[] destinition = Arrays.copyOfRange(arr1, 1, 7); //means arr1 {5, 3, 6, 7, 8, 9} elements copy to destinition array
        //range 1 upto 7 will copy in new destinition array.
        
        //below code is to print the destinition array element to check it.
        for (int i = 0; i < destinition.length; i++) {
        
            System.out.println("In Destinition :"+destinition[i]);
           
        }
        
        System.out.println("----------------------------------------------------");
        
        
        
        //unsorted array to sorted array Example below:
        int[] numbers= {1,2,3,8,5};
        System.out.println("Before sorting array :"+Arrays.toString(numbers));
        
        Arrays.sort(numbers);//sort() does not return a new array it just modifiy old array
        System.out.println("After sorting array looks like :"+Arrays.toString(numbers));
        
        System.out.println("---------------------------------------");
        
        
        //to find an element in array using binarySearch, we need to sort it first, then find. 
        int[] myInt = {21,23,34,5, 45,56,78,99,2};
        Arrays.sort(myInt); //sorting the array in ascending order.
        System.out.println("after sorting an array :"+Arrays.toString(myInt));
        int foundInt = Arrays.binarySearch(myInt, 2);
        System.out.println("found the desired element in position :"+foundInt);
        
        System.out.println("-------------------------------------");
        
        
        
        
        
    }
        
        
}
