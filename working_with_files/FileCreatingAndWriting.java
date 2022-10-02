
package working_with_files;

import java.util.Formatter;
import java.util.Locale;

/**
 *
 * @author Md. Talal Wasim Ahmed
 */
public class FileCreatingAndWriting {
    public static void main(String[] args) {
        try {
            //Formatter f = new Formatter("F:\\Taimur Ahmed.txt"); //create a file in destinitaion path
            Formatter f = new Formatter("C:\\Users\\Wasim Ahmed\\Desktop\\New folder\\Taimur Ahmed.txt"); //create a file in destinitaion path
            f.format("%s %s", "Taimur", "myboy\r\n");
            f.format("%s %s %s","1","Wasim","Ahmed\r");
            f.format("%s %s %s","2","Aiyaan","Abdus\r");
            f.format("%s %s %s","3","Nahi","Rasel");
            f.close();
            
        } catch (Exception e) {
            System.out.println("Error!"); 
                
        }
        
//        int f=1, i=2;
//        while(++i<5)
//            f*=i;
//            System.out.println(f);
    }
}
