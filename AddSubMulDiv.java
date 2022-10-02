import java.util.Scanner;

public class AddSubMulDiv {
    public static void main(String[] args){
        System.out.println("Enter number 1");
        Scanner input = new Scanner(System.in);
        int num1 = input.nextInt();
        System.out.println("Enter number 2");
        int num2 = input.nextInt();

        int add = num1 + num2;
        int sub = num1 - num2;
        int mul = num1 * num2;
        int div = num1 / num2;

        System.out.println("Addition is :"+add);
        System.out.println("Subtraction is :"+sub);
        System.out.println("Multiplication is :"+mul);
        System.out.println("Division is :"+div);

    }
}
