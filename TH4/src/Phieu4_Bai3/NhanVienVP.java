package Phieu4_Bai3;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVienVP extends NhanVien{
    private int soNgayNghi;
    private float mucLuong;
    
    @Override
    public double tinhLuong() {
        return mucLuong - soNgayNghi*10000;
    }
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap so ngay nghi: ");
        soNgayNghi = sc.nextInt();
        System.out.print("Nhap muc luong: ");
        mucLuong = sc.nextInt();
    }
    
    public static void inTieuDe() {
        NhanVien.inTieuDe();
        System.out.printf("%10s %15s %15s %15s%n", "So ngay nghi", "Muc luong", "Phu cap", "Luong");
    }
    
    public final void xuatDL() {
        super.xuatDL();
        System.out.printf("%10d %15f %15.2f %15.2f%n", soNgayNghi, mucLuong, tinhPhuCap(), tinhLuong());
    }
}
