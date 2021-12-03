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
public class DaGiac {
    Scanner ip = new Scanner(System.in);
    public int soCanh;
    int[] A = new int[soCanh];

    public int getSoCanh() {
        return soCanh;
    }

    public void setSoCanh(int soCanh) {
        this.soCanh = soCanh;
    }

    public int[] getA() {
        return A;
    }

    public void setA(int[] A) {
        this.A = A;
    }
    
    public int getChuVi()
    {   
        int P = 0;
        for(int x: A){
            P += x;
        }
        return P;
    }
    public void nhapGT()
    {   
        System.out.print("Nhap so canh: ");
        this.setSoCanh(ip.nextInt());
        int[] B = new int[soCanh];
        for(int i=0;i<soCanh;i++){
            System.out.print("Nhap kich thuoc canh thu " + (i+1) + ": ");
            B[i] = ip.nextInt();
        }
        this.setA(B);
    }
    
    public void inGT()
    {   
        System.out.println("So canh: " + this.soCanh);
        for(int i=0;i<soCanh;i++){
            System.out.println("Kich thuoc canh thu " + (i+1) + ": " + this.A[i]);
        }
        System.out.println("Chu vi: " + this.getChuVi());
    }
}
