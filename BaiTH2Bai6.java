
package modaujava;
import java.util.Scanner;

public class BaiTH2Bai6 {
    Scanner ip = new Scanner(System.in);
    public int a(int n)
    {
        int S = 0;
        for(int i = 1;i<=n;i++)
        {
            S += (Math.pow(-1,i+1)*i);
        }
        return S;
    }
    public int tinhGiaiThua(int n)
    {   
        int S = 1;
        for(int i=1;i<=n;i++)
        {
            S*=i;
        }
        return S;
    }
    public int b(int n)
    {
        int S = 0;
        for(int i = 1;i<=n;i++)
        {
            S+= tinhGiaiThua(i);
        }
        return S;
    }
    public int c()
    {   
        int n = ip.nextInt();
        int S = 0;
            for(int i=n;i>0;i-=2)
            {
                S+=i;
            }
            return S;
    }
    public void d(int n)
    {   
        double S = 0;
        for(double i = n; i>0; i--)
        {
            S += ((i-1)/i);
        }
        System.out.println(S);
    }
    
}
