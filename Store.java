/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JavaL01;

import static java.lang.System.exit;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Store {
    Scanner ip = new Scanner(System.in);
    protected double totalItems;
    protected int max_Items;
    private ArrayList<Book> listItems;

    public Store() {
        listItems = new ArrayList<>();
        listItems.add(new Book("001","nva",10000));
        listItems.add(new Book("002","nvb",5000));
        listItems.add(new Book("003","nvc",6000));
        listItems.add(new Book("004","nvd",2000));
        listItems.add(new Book("005","nve",15000));
    }

    public double getTotalItems() {
        return totalItems;
    }

    public void setTotalItems(double totalItems) {
        this.totalItems = listItems.size();
    }

    public int getMax_Items() {
        return max_Items;
    }

    public void setMax_Items(int max_Items) {
        this.max_Items = max_Items;
    }
    
    public void add(){
        Book newBook = new Book();
        newBook.input();
        if(this.getMax_Items() == listItems.size())
        {
            System.out.println("Thu vien da day");
        }
        if(this.contains(newBook) == false){
            listItems.add(newBook);
            this.totalItems++;
        }
        else{
            System.out.println("Sach nay da co");
        }
    }
    
    public void delete(){
        System.out.print("Nhap ten sach muon xoa: ");
        String tenSach = ip.nextLine();
        for (Book x: listItems)
        {
            if (x.getName().equalsIgnoreCase(tenSach)){
                listItems.remove(x);
                totalItems--;
                System.out.println("Xoa thanh cong!");
                break;
            }
            else
            {
                System.out.println("Khong co sach ten " + tenSach);
                break;
            }    
        }
    }
    
    public boolean contains(Book book){
        return listItems.contains(book);
    }
    
    public int indexOf(Book book){
        return listItems.indexOf(book);
    }
    
    public void find(){
        System.out.print("Nhap ten sach muon tim: ");
        String tenSach = ip.nextLine();
        for (Book x: listItems)
        {
            if (x.getName().equals(tenSach))
                x.output();
        }
    }
    
    public void edit(){
        System.out.print("Nhap ten sach muon sua: ");
        String tenSach = ip.nextLine();
        for (Book x: listItems)
        {
            if (x.getName().equals(tenSach)){
                Book book = new Book();
                book.input();
                listItems.set(listItems.indexOf(x), book);
            }
        }
    }
    
    public void listBook(){
        for (Book x: listItems)
        {
            x.output();
        }
    }
    
    public static void main(String[] args) {
        while(true){
            System.out.println("\t\tMENU");
            System.out.println("1.Them sach");
            System.out.println("2.Xoa sach");
            System.out.println("3.Tim sach");
            System.out.println("4.Sua sach");
            System.out.println("5.Hien thi toan bo sach");
            System.out.println("0.Thoat");
            int luaChon = ip.nextInt();
            switch(luaChon){
                case 1:
                    this.add();
                    break;
                case 2:
                    this.delete();
                    break;
                case 3:
                    this.find();
                    break;
                case 4:
                    this.edit();
                    break;
                case 5:
                    this.listBook();
                    break;
                case 0:
                    System.out.println("Xin Chao");
                    exit(0);
                default:
                    System.out.println("Chi nhap tu 0-6");
            }
        }
    }
    
}
