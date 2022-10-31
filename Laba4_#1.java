import java.util.Scanner;
import static java.lang.Math.*;

public class oliver2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("input r");
        double r = sc.nextDouble();
        System.out.println("input t");
        double t = sc.nextDouble();
        System.out.println("input y");
        double y = sc.nextDouble();
        System.out.println("input b");
        double b = sc.nextDouble();
        System.out.println("input z");
        double z = sc.nextDouble();
        System.out.println("input x");
        double x = sc.nextDouble();
        System.out.println("input a");
        double a = sc.nextDouble();
        System.out.println("W ="+W(r,t,y));
        System.out.println("L ="+L(b,z,x,y,a));

    }
    public static double W(double r, double t, double y){
        return (4*pow(t,3)+log(r))/(exp(y+r)+7.2*sin(r));
    }
    public static double L(double b, double z, double x, double y, double a){
        return b*z*z-5*x*y*sin(PI*PI-2*PI*x*y*z)-a*(abs(x-y*y+z*cos(x+y-z))+exp(1))/(pow(z,3)*(x-5*y)+pow(z,x*y));
    }
}