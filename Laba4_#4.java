import java.util.Scanner;

public class oliver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input temperature in Celsius");
        double t = sc.nextDouble();
        System.out.println((t*9/5)+32 + " in Fahrenheit");
    }
}