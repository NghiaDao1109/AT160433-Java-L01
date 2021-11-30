package modaujava;
import java.util.Scanner;
public class BaiTH1Bai2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        float a = input.nextFloat();
        float b = input.nextFloat();
        System.out.println(a + " + " + b +" = " + (a+b));
        System.out.println(a + " - " + b +" = " + (a-b));
        System.out.println(a + " * " + b +" = " + (a*b));
        System.out.println(a + " / " + b +" = " + (a/b));
        System.out.println(a + " % " + b +" = " + (a%b));
    }
}