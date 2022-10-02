
package javabeginner;

public class TryCatchDemo {
    public static void main(String[] args) {
        try {
            int[] myArray = new int[2];
            System.out.println(myArray[5]); 
            //exception handling -> 
            //when trying to access an array index that does not exist:
        } catch (Exception e) {
            System.out.println("An Error occured!");//ArrayIndexOutOfBounds Exceptions
        }
        
        //Without the try/catch block this code should crash the program, as a[5] does not exist.
    }
}
