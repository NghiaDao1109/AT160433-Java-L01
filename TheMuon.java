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
public class TheMuon extends SinhVien{
    Scanner ip = new Scanner(System.in);
    public int soPhieuMuon;
    public String ngayMuon;
    public String ngayTra;
    public String soHieuSach;

    public int getSoPhieuMuon() {
        return soPhieuMuon;
    }

    public void setSoPhieuMuon(int soPhieuMuon) {
        this.soPhieuMuon = soPhieuMuon;
    }

    public String getNgayMuon() {
        return ngayMuon;
    }

    public void setNgayMuon(String ngayMuon) {
        this.ngayMuon = ngayMuon;
    }

    public String getNgayTra() {
        return ngayTra;
    }

    public void setNgayTra(String ngayTra) {
        this.ngayTra = ngayTra;
    }

    public String getSoHieuSach() {
        return soHieuSach;
    }

    public void setSoHieuSach(String soHieuSach) {
        this.soHieuSach = soHieuSach;
    }

    public void nhapTT(){
        System.out.print("Nhap ten sinh vien: ");
        this.setHoTen(ip.nextLine());
        System.out.print("Nhap nam sinh: ");
        this.setNamSinh(ip.nextInt());
        this.setTuoi();
        System.out.print("Nhap ten lop: ");
        this.setLop(ip.nextLine());
        System.out.print("Nhap so phieu muon: ");
        this.setSoPhieuMuon(ip.nextInt());
        System.out.print("Nhap ngay muon: ");
        this.setNgayMuon(ip.nextLine());
        System.out.print("Nhap ngay tra sach: ");
        this.setNgayTra(ip.nextLine());
        System.out.print("Nhap so hieu sach: ");
        this.setSoHieuSach(ip.nextLine());
    }
    
    public void inTT(){
        System.out.println("Ten sinh vien: " + this.hoTen);
        System.out.println("Nam sinh: " + this.namSinh);
        System.out.println("Tuoi: " + this.tuoi);
        System.out.println("Lop: " + this.Lop);
        System.out.println("So phieu muon: " + this.soPhieuMuon);
        System.out.println("Ngay muon: " + this.ngayMuon);
        System.out.println("Ngay tra sach: " + this.ngayTra);
        System.out.println("So hieu sach: " + this.soHieuSach);
    }
    
   
}
