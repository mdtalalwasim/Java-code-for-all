package working_with_files;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/**
 *
 * @author Md. Talal Wasim
 */
public class FileHandling_Demo_1 {

    public static void main(String[] args) {
        File myFile = new File("F:\\javafile.txt");
        if (myFile.exists()) {
            System.out.println(myFile.getName() + " Congrats! File is Exists");
            System.out.println(myFile.renameTo(myFile) + "see");
        } else {
            System.out.println("The file doesn't exist!");
        }

        //**********************
        try {
            File x = new File("F:\\javafile.txt");
            Scanner sc = new Scanner(x);
            while (sc.hasNext()) {
                System.out.println(sc.next());
            }
            sc.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error");
        }

        //*********************
    }
}
