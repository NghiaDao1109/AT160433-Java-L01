
package modaujava;

import java.util.Scanner;
    

public class BaiTH2Bai3 {

     public static int soNgayTrongThang(int m, int y) {
        switch (m) {
            case 1: case 3: case 5: case 7: case 8: case 10: case 12:
                return 31;
            case 4: case 6: case 9: case 11:
                return 30;
            case 2:
                if (y%400==0||(y%4==0&&y%100!=0)) {
                    return 29;
                } else {
                    return 28;
                }
            default:
                return 0;
        }
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int d = input.nextInt();
        int m = input.nextInt();
        int y = input.nextInt();
        do{
            System.out.print("Nhap thang: ");
            m = input.nextInt();
        }while(m < 1 || m > 12);
        int soNgay = soNgayTrongThang(m, y);
        do{
            System.out.print("Nhap ngay: ");
            d = input.nextInt();
        }while(d < 1 || d > soNgay);
        int laNamNhuan = 0;
	{
            {if (y%400==0||(y%4==0&&y%100!=0))
                laNamNhuan=1;}
            for(int i = 1;i<m;i++)
            {
                if((i % 2 != 0) && (i<8) || (i%2==0) && (i >= 8 ))
                {
                    d = d + 31;
                }
                else if((((i % 2 == 0) && (i != 2)) && (i<8)) || (i % 2 !=0) && (i > 8)) 
                {
                    d = d + 30;
                }
                 else
                {
                    d = d + 28;
                    if(laNamNhuan == 1)
                        d++;
                }
            }
        }   
        System.out.println(d);
    }
}
