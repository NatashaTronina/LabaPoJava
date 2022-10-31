import java.util.Scanner;

public class oliver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input v1");
        double v1 = sc.nextDouble();
        System.out.println("input v2");
        double v2 = sc.nextDouble();
        System.out.println("input t");
        double t = sc.nextDouble();
        System.out.println("T ="+(v1*t)/(v1-v2));
    }
}