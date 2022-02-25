import java.util.Scanner;

public class integrals {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Input your numbers");
        int a = in.nextInt();
        int b = in.nextInt();
        System.out.println("Интеграл: " + F(a,b));
    }
    public static double F(int a, int b) {
        double fa = Math.pow(a,5.0)/5 +Math.pow(a,3)/3 +Math.pow(a,2)/2 -7*a;
        double fb = Math.pow(b,5.0)/5 +Math.pow(b,3)/3 +Math.pow(b,2)/2 -7*b;
        return (fb - fa);
    }

}
