
package array_demo;

/**
 * 
 * @author Md. Talal Wasim
 * https://github.com/mdtalalwasim
 */

public class MultidimesionalArrayDemo1 {
    public static void main(String[] args) {
        /**another way to declare array
         * int[][] numbers;
           numbers = new int[2][3];
           */
        int numbers[][] = new int[2][3];
        
        /**array should this:
         * 10 20 30
         * 40 50 60
         */
        
        numbers[0][0] = 10;
        numbers[0][1] = 20;
        numbers[0][2] = 30;
        numbers[1][0] = 40;
        numbers[1][1] = 50;
        numbers[1][2] = 60;
        
        System.out.println("Array Elements print => Without using Loop");
        System.out.print(" "+numbers[0][0]);
        System.out.print(" "+numbers[0][1]);
        System.out.print(" "+numbers[0][2]);
        System.out.println();
        System.out.print(" "+numbers[1][0]);
        System.out.print(" "+numbers[1][1]);
        System.out.println(" "+numbers[1][2]);
        System.out.println();
        
        
        System.out.println("Array Elements Print => Using Loop!");
        int num[][] = new int[2][3];
        num[0][0] = 70;
        num[0][1] = 80;
        num[0][2] = 90;
        num[1][0] = 50;
        num[1][1] = 60;
        num[1][2] = 20;
        
        for (int row = 0; row < 2; row++) {
            for (int col = 0; col < 3; col++) {
                System.out.print(" "+num[row][col]);
            }   
            System.out.println();
           
        }
        
        
        
        
    }
    
    
    
}
