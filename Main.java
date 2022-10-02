import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Enter Number 1");
        Scanner input = new Scanner(System.in);
        double num1 = input.nextDouble();
        System.out.println("Enter Number 2");
        double num2 = input.nextDouble();
        System.out.println("Enter Number 3");
        double num3 = input.nextDouble();

        double area = num1*num2*num3;
        System.out.println("Area is:"+area);

    }
}