/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaL01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Nguoi {
    Scanner ip = new Scanner(System.in);
    public String hoTen;
    public String diaChi;
    public int namSinh;
    
     public void nhapTT()
     {
        System.out.print("Nhap ten: ");
        this.hoTen = ip.nextLine();
        System.out.print("Nhap dia chi: ");
        this.diaChi = ip.nextLine();
        System.out.print("Nhap nam sinh: ");
        this.namSinh = ip.nextInt();
     }
     public void inTT()
     {
        System.out.println("Ten: " + this.hoTen);
        System.out.println("Dia chi: " + this.diaChi);
        System.out.println("Nam sinh: " + this.namSinh);
     }
}
