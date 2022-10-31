import java.util.Scanner;

public class oliver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input r");
        double r = sc.nextDouble(); //решая данную задачу придем к выводу что в прямоугольном треугольной пирамиде сторона основания всегда равна 6r/sqrt(3)
        System.out.println(6*r/Math.sqrt(3));
    }
}