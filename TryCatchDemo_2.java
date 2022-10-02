
package javabeginner;

public class TryCatchDemo_2 {
    public static void main(String[] args) {
        int x = 20;
        int y = 0;
        
        try{
            int z = x/y; //Not posssible! Something Divided by Zero is = Undefind.
            System.out.println(z);
            
        } catch(Exception e){
            System.err.println("Error! You can not Divide a number by Zero!");
        }
        
    }
}
