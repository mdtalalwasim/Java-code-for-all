
package array_demo;

import java.util.Arrays;

/**
 *
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */
public class ArrayCopyDemo1 {
    public static void main(String[] args) {
        char array1[] = {'h','e','l','p','A','l','l','a','h','e','g','e'};
        
        char array2[] = new char[5];
        
       // System.out.println("After Copying :"+Arrays.copyOfRange(array2, 4, 9));
       System.arraycopy(array1, 4, array2, 0, 5);//return as string
        System.out.println(new String(array2));
        
        
        //array2[] =Arrays.copyOfRange(array2, 4, 11);
        char array3[] = Arrays.copyOfRange(array1, 4, 10);
        System.out.println("After Copying :");
        for (int i = 0; i < array3.length; i++) {
            System.out.print(" "+array3[i]);
        }
       
    }
}
