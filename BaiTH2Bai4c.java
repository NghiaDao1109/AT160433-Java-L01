package modaujava;
import static java.lang.Math.sqrt;
import java.util.Scanner;
public class BaiTH2Bai4c {
    public static int isSNT(int n)
    {   
        if(n == 2)
        {
            return 1;
        }
        int i=2;
        do
        {
            if(n%i == 0)
            {
                return 0;
            }
        }while(i<sqrt(n));
        return 1;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int i=2;
        do
        {   
            if(isSNT(i) == 1)
            {
                System.out.print(i + " ");
            }
            i++;
        }while(i<n);
    }
}
