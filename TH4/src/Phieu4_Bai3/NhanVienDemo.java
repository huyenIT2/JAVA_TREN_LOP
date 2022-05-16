package Phieu4_Bai3;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVienDemo {
    static int soNV, loaiNV;
    static double tongLuong = 0f;
    static NhanVien myNV[];
    
    static void nhapDSNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong NV: ");
        soNV = sc.nextInt();
        myNV = new NhanVien[soNV];
        for (int i=0; i<soNV; i++) {
            System.out.println("1. Nhap NVSX, 2. NVVP");
            loaiNV = sc.nextInt();
            if (loaiNV == 1) 
                myNV[i] = new NhanVienSX();
            else
                myNV[i] = new NhanVienVP();
            myNV[i].nhap();
            tongLuong += myNV[i].tinhLuong() + myNV[i].tinhPhuCap();
        }
    }
    
    static void inDSNV() {
        System.out.println("\nDANH SACH NHAN VIEN SX");
        NhanVienSX.inTieuDe();
        for (int i=0; i<soNV; i++)
            if (myNV[i] instanceof NhanVienSX)
                myNV[i].xuatDL();
        
        System.out.println("\nDANH SACH NHAN VIEN VP");
        NhanVienVP.inTieuDe();
        for (int i=0; i<soNV; i++)
            if (myNV[i] instanceof NhanVienVP)
                myNV[i].xuatDL();
        DecimalFormat f = new DecimalFormat("###,###.0#");
        System.out.println("Tong luong nhan vien: " + f.format(tongLuong));
    }
    
    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
    }
    
}
