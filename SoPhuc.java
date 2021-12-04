
package JavaL01;

import java.util.Scanner;

public class SoPhuc {
    Scanner ip = new Scanner(System.in);
    public double phanThuc;
    public double phanAo;

    public SoPhuc() {
    }

    public SoPhuc(float pt, float pa) {
        this.phanThuc = pt;
        this.phanAo = pa;
    }

    public Scanner getIp() {
        return ip;
    }

    public void setIp(Scanner ip) {
        this.ip = ip;
    }

    public double getPhanThuc() {
        return phanThuc;
    }

    public void setPhanThuc(double phanThuc) {
        this.phanThuc = phanThuc;
    }

    public double getPhanAo() {
        return phanAo;
    }

    public void setPhanAo(double phanAo) {
        this.phanAo = phanAo;
    }
    
    public void nhapSoPhuc(){
        System.out.print("Nhap phan thuc: ");
        this.setPhanThuc(ip.nextDouble());
        System.out.print("Nhap phan ao: ");
        this.setPhanAo(ip.nextDouble());
    }
    
    public void inSoPhuc(){
        System.out.print("So thuc: " + this.phanThuc + " + " + this.phanAo +"i");
    }
    
    public SoPhuc congSoPhuc(SoPhuc sp){
        SoPhuc c = new SoPhuc();
        c.setPhanThuc(this.phanThuc + sp.getPhanThuc());
        c.setPhanAo(this.phanAo + sp.getPhanAo());
        return c;
    }
    
    public SoPhuc truSoPhuc(SoPhuc sp){
        SoPhuc c = new SoPhuc();
        c.setPhanThuc(this.phanThuc - sp.getPhanThuc());
        c.setPhanAo(this.phanAo - sp.getPhanAo());
        return c;
    }
    
    public SoPhuc nhanSoPhuc(SoPhuc sp){
        SoPhuc c = new SoPhuc();
        c.setPhanThuc(this.phanThuc*sp.getPhanThuc() - this.getPhanAo()*sp.phanAo);
        c.setPhanAo(this.phanAo*sp.getPhanThuc() + this.phanThuc*sp.getPhanAo());
        return c;
    }
    
    public SoPhuc chiaSoPhuc(SoPhuc sp){
        SoPhuc c = new SoPhuc();
        c.setPhanThuc((this.phanThuc*sp.getPhanThuc() + this.getPhanAo()*sp.getPhanAo())/(Math.pow(sp.getPhanThuc(), 2) + Math.pow(sp.getPhanAo(), 2)));
        c.setPhanAo((this.phanAo*sp.getPhanThuc() - this.phanThuc*sp.getPhanAo())/(Math.pow(sp.getPhanThuc(), 2) + Math.pow(sp.getPhanAo(), 2)));
        return c;
    }
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        SoPhuc a = new SoPhuc(1,2);
        SoPhuc b = new SoPhuc(3,4);
        System.out.print("a + b: ");
        a.congSoPhuc(b).inSoPhuc();
        System.out.print("\na - b: ");
        a.truSoPhuc(b).inSoPhuc();
        System.out.print("\na * b: ");
        a.nhanSoPhuc(b).inSoPhuc();
        System.out.print("\na / b: ");
        a.chiaSoPhuc(b).inSoPhuc();
    }
}
