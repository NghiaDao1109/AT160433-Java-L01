/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaL01;

/**
 *
 * @author ADMIN
 */
public class TamGiac extends DaGiac{
    
    public double getDienTich(){     
        int P = this.getChuVi()/2;
        double S = P;
        for(int i = 0;i < 3; i++){
            S *= (P-this.A[i]);
        }
        return Math.sqrt(S);
    }
    @Override
    public void nhapGT() {
        int laTamGiac = 0;
        int[] B = new int[3];
        while(laTamGiac == 0){
            this.setSoCanh(3);        
            for(int i=0;i<3;i++){
                System.out.print("Nhap kich thuoc canh thu " + (i+1) + ": ");
                B[i] = ip.nextInt();
            }   
            if((B[0] + B[1] >= B[2]) && (B[1] + B[2] >= B[0]) && (B[0] + B[2] >= B[1])){
                laTamGiac = 1;
            }
            else{
                System.out.println("Day khong phai tam giac");
                System.out.println("Moi ban nhap lai");
            }
        }
        this.setA(B);
    }

    @Override
    public void inGT() {
        super.inGT();
        System.out.println("Dien tich: " + this.getDienTich());
    }
}
