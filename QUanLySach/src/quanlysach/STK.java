/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class STK extends Sach{
    protected int thue;

    public STK() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc =new Scanner(System.in);
        System.out.print("Thuế: ");
        thue = sc.nextInt();
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" - Thuế: " + thue);
    }
    
    @Override
    public double gia() {
        return donGia*soLuong+thue;
    }
    
}
