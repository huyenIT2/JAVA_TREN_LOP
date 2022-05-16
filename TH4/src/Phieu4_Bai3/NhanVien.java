package Phieu4_Bai3;

import java.time.LocalDate;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
abstract class NhanVien {
    protected String maNV;
    protected String hoTen;
    protected int namVaoLam;
    static double tongLuong;
    final double PHUCAP_BANDAU = 100000;
    abstract public double tinhLuong();
    
    public String getMaNV() {
        return maNV;
    }
    
    protected double tinhPhuCap() {
        Date now = new Date();
        int d = LocalDate.now().getYear();
        return PHUCAP_BANDAU + (d - namVaoLam)*20000;
    }
    
    public NhanVien(String maNV) {
        this.maNV = maNV;
        this.hoTen = "";
        this.namVaoLam = 2012;
    }
    
    public NhanVien() {
        this.maNV = "nv0";
        this.hoTen = "";
        this.namVaoLam = 2000;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma NV: ");
        maNV = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap nam vao lam: ");
        namVaoLam = sc.nextInt();
    }
    
    public static void inTieuDe() {
        System.out.printf("%-10s %-15s %6s", "Ma NV", "Ho ten", "Nam vao lam");
    }
    
    public void xuatDL() {
        System.out.printf("%-10s %-15s %6s", maNV, hoTen, namVaoLam);
    }
}
