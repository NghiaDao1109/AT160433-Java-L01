
package modaujava;
import java.util.Scanner;
public class BaiTH1Bai1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Nhap so canh da giac: ");
        int n = input.nextInt();
        System.out.println("Nhap do dai " + n + " canh:");
        int[] A;
        A = new int[n];
        int P = 0;
        for(int i=0;i<n;i++)
        {
            System.out.print("Do dai canh thu " + (i+1) + ":");
            A[i] = input.nextInt();
        }
        System.out.println("Da giac co " + n + "canh");
        System.out.print("Do dai cac canh lan luot la:");
        for(int i=0;i<n;i++)
        {
            System.out.print(A[i] + " ");
            P = P + A[i];
        }
        System.out.println("Chu vi da giac tren: " + P);
    }
}