
package modaujava;

import static java.lang.Math.sqrt;

public class ToanHoc {
    int n;
    public void isSNT(int a)
    {
        if(a == 2)
        {
            System.out.println("La SNT");
        }
        for(int i=2;i<=sqrt(n);i++)
        {
            if(n%i == 0)
            {
                System.out.println("Khong la SNT");
            }
        }
        System.out.println("La SNT");
    }
    public void isSHH(int a)
    {
        int S = 1;
        for(int i=2;i<a;i++)
        {
            if(a%i == 0)
             S+=i;
        }
         if(S == a && a != 1)
             System.out.println("La so hoan hao");
         else
             System.out.println("Khong la so hoan hao");
    }
    public void isSCP(int a)
    {
        int  x= (int) sqrt(a);
	int scp=0;
	{if (x*x==a)
		scp=1;
	}
	{if (scp==1)
            System.out.println("La so chinh phuong");
	else
            System.out.println("Khong la so chinh phuong");
	}
    }
    public void isLn(int a)
    { 
        int p = 2;
        int q = 1;
        int Ln = 0;
        if(a == 0)
        {
            Ln = 2;
        }
        if(a == 1)
        {
            Ln = 1;
        }
        for(int i=2;i<=a;i++)
        {
            Ln = p + q;
            int temp = Ln;
                p = q;
                q = temp;
        }
        System.out.println("Phan tu thu " + a + "cua day la: " + Ln);
    }
}
