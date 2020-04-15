/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.time.LocalDate;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class SGK extends Sach{
    protected boolean tinhTrang;

    public SGK() {
        super();
    }

    public SGK(boolean tinhTrang, int maSach, String tieuDe, LocalDate ngayNhap, int donGia, int soLuong, String NXB) {
        super(maSach, tieuDe, ngayNhap, donGia, soLuong, NXB);
        this.tinhTrang = tinhTrang;
    }

    public void isTinhTrang() {
        if(tinhTrang == true)
            System.out.println(" - Tình trạng: Mới");
        else
            System.out.println(" - Tình trạng: Cũ");
        
    }

    public void setTinhTrang(boolean tinhTrang) {
        this.tinhTrang = tinhTrang;
    }

    @Override
    public void nhap() {
        super.nhap(); //To change body of generated methods, choose Tools | Templates.
        Scanner sc = new Scanner(System.in);
        System.out.print("Tình trạng sách(mới = true, cũ = false): ");
        tinhTrang = Boolean.parseBoolean(sc.nextLine());
    }

    @Override
    public void xuat() {
        super.xuat(); //To change body of generated methods, choose Tools | Templates.
        isTinhTrang();
        
    }
    
    @Override
    public double gia() {
        if(tinhTrang)
            return soLuong*donGia;
        else
            return soLuong*donGia/2;
    }
    
}
