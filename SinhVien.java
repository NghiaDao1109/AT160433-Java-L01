/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaL01;

import java.util.Calendar;

/**
 *
 * @author ADMIN
 */
public class SinhVien {
    public String hoTen;
    public int namSinh;
    public String Lop;
    public int tuoi;

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public int getNamSinh() {
        return namSinh;
    }

    public void setNamSinh(int namSinh) {
        this.namSinh = namSinh;
    }

    public String getLop() {
        return Lop;
    }

    public void setLop(String Lop) {
        this.Lop = Lop;
    }
    
    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int namSinh) {
        Calendar instance = Calendar.getInstance();
        int year = instance.get(Calendar.YEAR);
        this.tuoi = year - this.getNamSinh();
    }
    
}
