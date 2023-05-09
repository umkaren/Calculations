import java.util.Scanner;
public class Calculations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter a number:");
        int num1 = Integer.valueOf(scanner.nextLine());

        System.out.println("Enter another number:");
        int num2 = Integer.valueOf(scanner.nextLine());

        int Addition = num1 + num2;
        System.out.println(num1 + " + " + num2 + " = " + Addition);

        int Subtraction = num1 - num2;
        System.out.println(num1 + " - " + num2 + " = " + Subtraction);

        int Multiplication = num1 * num2;
        System.out.println(num1 + " * " + num2 + " = " + Multiplication);

        float Division = Float.valueOf(num1) / Float.valueOf(num2);
        System.out.println(num1 + " / " + num2 + " = " + Division);

        int Modulus = num1 % num2;
        System.out.println(num1 + " % " + num2 + " = " + Modulus);
    }
}
