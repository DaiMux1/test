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
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int choose;
        QuanLySach ql = new QuanLySach();
        do {       
            choose = sc.nextInt();
            switch(choose){
                case 1:
                    ql.nhapSGK();
                    break;
                case 2:
                    ql.nhapSTK();
                    break;
                case 3:
                    ql.nhapSNN();
                    break;
                case 4:
                    ql.xuatSGK();
                    break;
                case 5:
                    ql.xuatSTK();
                    break;
                case 6:
                    ql.xuatSNN();
                    break;
                case 7:
                    System.out.println("tổng tiền SGK: "+ql.tongTienSGK());
                    break;
                case 8:
                    System.out.println("Tổng tiền STK: "+ql.tongTienSTK());
                    break;
                case 9:
                    System.out.println("Tổng tiền SNN: "+ql.tongTienSNN());
                    break;
                case 10:
                    System.out.println("Trung bình cộng đơn giá SGK: "+ql.TBCDonGiaSNN());
                    break;
                case 11:
                    System.out.print("Tên nhà xuất bản: ");
                    String a = sc.nextLine();
                    ql.NXBSGK(a);
                    break;
            }
        } while (true);
        
    }
    
}
