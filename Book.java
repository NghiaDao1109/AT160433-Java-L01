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
public class Book {
    Scanner ip = new Scanner(System.in);
    protected String id;
    protected String name;
    protected double price;

    public Book() {
    }

    public Book(String id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
    
    public void input(){
        System.out.print("Nhap ID sach: ");
        this.setId(ip.nextLine());
        System.out.print("Nhap ten sach: ");
        this.setName(ip.nextLine());
        System.out.print("Nhap gia sach: ");
        this.setPrice(ip.nextDouble());
    }
    
    public void output(){
        System.out.println("ID sach: " + this.getId());
        System.out.println("Ten sach: " + this.getName());
        System.out.println("Gia sach: " + this.getPrice());
    }
    
    
}
