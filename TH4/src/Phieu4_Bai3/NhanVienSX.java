/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Phieu4_Bai3;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVienSX extends NhanVien{
    private int soSanPham;
    
    public NhanVienSX(String maNV) {
        super(maNV);
        soSanPham = 0;
    }
    
    public NhanVienSX() {
        super();
        soSanPham = 0;
    }

    @Override
    public double tinhLuong() {
        return soSanPham * 10000;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so san pham: ");
        soSanPham = sc.nextInt();
    }
    
    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s%n", "So SP", "Phu cap", "Luong");
    }
    
    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%10d %15.2f %15.2f%n", soSanPham, tinhPhuCap(), tinhLuong());
    }

    public int getSoSanPham() {
        return soSanPham;
    }

    public void setSoSanPham(int soSanPham) {
        this.soSanPham = soSanPham;
    }
    
}
