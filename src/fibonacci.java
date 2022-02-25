import java.util.Scanner;

public class fibonacci {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your number");
        int number = in.nextInt();
        int fibonacci = 1;
        int last_fibonacci = 1;
        int last_last_fibonacci = 0;
        boolean isFibbonaci = false;
        if (fibonacci == number) {
            System.out.println("Yes, your number is fibonacci number");

        }
        if (number == 0) {
            System.out.println("Yes, your number is fibonacci number");
        }
        while (fibonacci<number) {
            fibonacci = last_fibonacci + last_last_fibonacci;
            last_last_fibonacci = last_fibonacci;
            last_fibonacci = fibonacci;
            if (fibonacci == number) {
                System.out.println("Yes, your number is fibonacci number");
                isFibbonaci = true;
            }
        }
        if (!isFibbonaci) {
            System.out.println("No, your number isn't fibonacci number");
        }
    }
}
