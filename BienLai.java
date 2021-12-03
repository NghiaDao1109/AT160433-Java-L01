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
public class BienLai extends KhachHang{
    Scanner ip = new Scanner(System.in);
    public int soChiCu;
    public int soChiMoi;
    public double tongTien;

    public int getSoChiCu() {
        return soChiCu;
    }

    public void setSoChiCu(int soChiCu) {
        this.soChiCu = soChiCu;
    }

    public int getSoChiMoi() {
        return soChiMoi;
    }

    public void setSoChiMoi(int soChiMoi) {
        this.soChiMoi = soChiMoi;
    }

    public double getTongTien() {
        return tongTien;
    }

    public void setTongTien() {
        this.tongTien = (double) (this.soChiMoi - this.soChiCu) * 850000;
    }
    
    public void nhapTT(){
        System.out.print("Nhap ho ten khach hang: ");
        this.setHoTen(ip.nextLine());
        System.out.print("Nhap so nha: ");
        this.setSoNha(ip.nextInt());
        System.out.print("Nhap ma so cong to dien: ");
        this.setMaSoCongToDien(ip.nextInt());
        System.out.print("Nhap so chi cu: ");
        this.setSoChiCu(ip.nextInt());
        System.out.print("Nhap so chi moi: ");
        this.setSoChiMoi(ip.nextInt());
        this.setTongTien();
    }
    public void inTT(){
        System.out.println("Ho ten khach hang: " + this.hoTen);
        System.out.println("So nha: " + this.soNha);
        System.out.println("Ma so cong to dien: " + this.maSoCongToDien);
        System.out.println("So chi cu: " + this.soChiCu);
        System.out.println("So chi moi: " + this.soChiMoi);
        System.out.println("Thanh tien: " + this.tongTien);
    }
}
