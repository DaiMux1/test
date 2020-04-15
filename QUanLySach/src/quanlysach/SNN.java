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
public class SNN extends Sach{
    protected String ngonNgu;

    public SNN() {
        super();
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc =new Scanner(System.in);
        System.out.print("Ngôn ngữ: ");
        ngonNgu = sc.nextLine();
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        System.out.println(" - Ngôn ngữ: "+ngonNgu);
    }
    
    @Override
    public double gia() {
        return soLuong*donGia*1.2;
    }
    
}
