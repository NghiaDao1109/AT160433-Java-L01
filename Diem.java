/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaL01;

import modaujava.MyPoint;

/**
 *
 * @author ADMIN
 */
public class Diem {
    public double x,y;

    public Diem() {
    }

    public Diem(double x, double y) {
        this.x = x;
        this.y = y;
    }
    @Override
    public String toString() {
        return "(x;y) = (" + x + ';' + y + ')' ;
    }
    
    public double distance(int a,int b){
        return Math.sqrt(Math.pow(a-x, 2) + Math.pow(b-y,2));
    }
    public double distance(Diem p1){
        return Math.sqrt(Math.pow(p1.x - x, 2) + Math.pow(p1.y - y, 2));
    }
}
