
package array_demo;

/**
 *
 * @author Md. Talal Wasim.
 * https://github.com/mdtalalwasim
 * 
 * 0 1 2 3 4
 * 5 6
 * 7 8 9
 * 10 11 12 13 14
 * 15 16
 * 17
 * 18 19 20
 */
public class MultidimensionalArrayDemo2 {
    public static void main(String[] args) {
        int numbers[][] = new int[7][];
        
        numbers[0] = new int[5];
        numbers[1] = new int[2];
        numbers[2] = new int[3];
        numbers[3] = new int[5];
        numbers[4] = new int[2];
        numbers[5] = new int[1];
        numbers[6] = new int[3];
        
        //initialize array element
        int count = 0;
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                numbers[row][col] = count;
                count++;
            }
        }
        
        for (int row = 0; row < numbers.length; row++) {
            for (int col = 0; col < numbers[row].length; col++) {
                System.out.print(" "+numbers[row][col]);
            }
            System.out.println();
        }
    }
}
