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
public abstract class Sach {

    protected int maSach;
    protected String tieuDe;
    protected LocalDate ngayNhap;
    protected int donGia;
    protected int soLuong;
    protected String NXB;

    public Sach() {
    }

    public Sach(int maSach, String tieuDe, LocalDate ngayNhap, int donGia, int soLuong, String NXB) {
        this.maSach = maSach;
        this.tieuDe = tieuDe;
        this.ngayNhap = ngayNhap;
        this.donGia = donGia;
        this.soLuong = soLuong;
        this.NXB = NXB;
    }

    public int getMaSach() {
        return maSach;
    }

    public void setMaSach(int maSach) {
        this.maSach = maSach;
    }

    public String getTieuDe() {
        return tieuDe;
    }

    public void setTieuDe(String tieuDe) {
        this.tieuDe = tieuDe;
    }

    public LocalDate getNgayNhap() {
        return ngayNhap;
    }

    public void setNgayNhap(LocalDate ngayNhap) {
        this.ngayNhap = ngayNhap;
    }

    public int getDonGia() {
        return donGia;
    }

    public void setDonGia(int donGia) {
        this.donGia = donGia;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getNXB() {
        return NXB;
    }

    public void setNXB(String NXB) {
        this.NXB = NXB;
    }

    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Mã sách: ");
        maSach = Integer.parseInt(sc.nextLine());
        System.out.print("Tiêu đè: ");
        tieuDe = sc.nextLine();
        int ngay, thang, nam;
        System.out.println("Nhập ngày tháng năm");
        System.out.print("Ngày: ");
        ngay = Integer.parseInt(sc.nextLine());
        System.out.print("Tháng: ");
        thang = Integer.parseInt(sc.nextLine());
        System.out.print("Năm: ");
        nam = Integer.parseInt(sc.nextLine());
        ngayNhap = LocalDate.of(nam, thang, ngay);
        System.out.print("Đơn giá: ");
        donGia = Integer.parseInt(sc.nextLine());
        System.out.print("Số lượng: ");
        soLuong = Integer.parseInt(sc.nextLine());
        System.out.print("Nhà xuất bản: ");
        NXB = sc.nextLine();
    }
    public void xuat(){
        System.out.print("Mã sách: "+ maSach + " - Tiêu đề: " + tieuDe + " - Ngày nhập: "+ngayNhap+" - Đơn giá: "+donGia+" - Số lượng: "+soLuong+" - Nhà xuất bản: "+NXB);
    }
    public abstract double gia();
}
