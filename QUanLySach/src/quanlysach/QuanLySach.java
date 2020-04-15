/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package quanlysach;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author admin
 */
public class QuanLySach {

    /**
     * @param args the command line arguments
     */
    ArrayList<SGK> listSgks = new ArrayList<>();
    ArrayList<STK> listStks = new ArrayList<>();
    ArrayList<SNN> listSnns = new ArrayList<>();

    public QuanLySach() {
    }

    public ArrayList<SGK> getListSgks() {
        return listSgks;
    }

    public void setListSgks(ArrayList<SGK> listSgks) {
        this.listSgks = listSgks;
    }

    public ArrayList<STK> getListStks() {
        return listStks;
    }

    public void setListStks(ArrayList<STK> listStks) {
        this.listStks = listStks;
    }

    public ArrayList<SNN> getListSnns() {
        return listSnns;
    }

    public void setListSnns(ArrayList<SNN> listSnns) {
        this.listSnns = listSnns;
    }

    public void nhapSGK() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Số đầu sách giáo khoa: ");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            SGK m = new SGK();
            m.nhap();
            listSgks.add(m);
        }
    }

    public void nhapSTK() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Số đầu sách tham khảo: ");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            STK m = new STK();
            m.nhap();
            listStks.add(m);
        }
    }

    public void nhapSNN() {
        Scanner sc = new Scanner(System.in);
        int a;
        System.out.print("Số đầu sách ngoại ngữ: ");
        a = sc.nextInt();
        for (int i = 0; i < a; i++) {
            SNN m = new SNN();
            m.nhap();
            listSnns.add(m);
        }
    }

    public void xuatSGK() {
        for (SGK listSgk : listSgks) {
            listSgk.xuat();
        }
    }

    public void xuatSTK() {
        for (STK listStk : listStks) {
            listStk.xuat();
        }
    }

    public void xuatSNN() {
        for (SNN listSnn : listSnns) {
            listSnn.xuat();
        }
    }

    public double tongTienSGK() {
        double a = 0;
        for (SGK listSgk : listSgks) {
            a += listSgk.gia();
        }
        return a;
    }
    public double tongTienSTK() {
        double a = 0;
        for (STK listStk : listStks) {
            a += listStk.gia();
        }
        return a;
    }
    public double tongTienSNN() {
        double a = 0;
        for (SNN listSnn : listSnns) {
            a += listSnn.gia();
        }
        return a;
    }
    public double TBCDonGiaSNN(){
        int a = 0;
        for (SNN m : listSnns) {
            a+=m.getDonGia();
        }
        return a/listSnns.size();
    }
    public void NXBSGK(String a){
        for (SGK listSgk : listSgks) {
            if(listSgk.getNXB().equalsIgnoreCase(a)){
                listSgk.xuat();
            }
        }
    }
}
