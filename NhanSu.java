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
public class NhanSu extends Nguoi{
    Scanner ip = new Scanner(System.in);
    public String maNhanSu;
    public int heSoChucVu;
    public int heSoLuong;
    public int luongCoBan;
    public String getMaNhanSu() {
        return maNhanSu;
    }

    public void setMaNhanSu(String maNhanSu) {
        this.maNhanSu = maNhanSu;
    }

    public int getHeSoChucVu() {
        return heSoChucVu;
    }

    public void setHeSoChucVu(float heSoChucVu) {
        this.heSoChucVu = heSoChucVu;
    }

    public int getHeSoLuong() {
        return heSoLuong;
    }

    public void setHeSoLuong(float heSoLuong) {
        this.heSoLuong = heSoLuong;
    }

    public int getLuongCoBan() {
        return luongCoBan;
    }

    public void setLuongCoBan(int luongCoBan) {
        this.luongCoBan = luongCoBan;
    }

    public int luong(){
        return (heSoLuong + heSoChucVu)*this.getLuongCoBan() - heSoLuong*this.getLuongCoBan()*(5/100);
    }
    @Override
    public void nhapTT() {
        super.nhapTT();
        System.out.print("Nhap ma nhan su: ");
        this.setMaNhanSu(ip.nextLine());
        System.out.print("Nhap he so chuc vu: ");
        this.setHeSoChucVu(ip.nextInt());
        System.out.print("Nhap ge so luong: ");
        this.setHeSoLuong(ip.nextInt());
    }

    @Override
    public void inTT() {
        super.inTT();
        System.out.println("Luong nhan vien: " + luong());
    }

    

    

}
