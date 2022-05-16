package Phieu2;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVien {
    private String hoDem;
    private String tenNV; 
    private NgayThang ngaySinh = new NgayThang();
    private NgayThang ngayVaoLam = new NgayThang();
    
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho dem: ");
        hoDem = sc.nextLine();
        System.out.print("Nhap ten NV: ");
        tenNV = sc.nextLine();
        System.out.println("Nhap ngay sinh: ");
        ngaySinh.nhap();
        System.out.println("Nhap ngay vao lam: ");
        ngayVaoLam.nhap();
    }
    
    static void inTieuDe() {
        System.out.printf("%-15s %-10s %15s %15s%n", "Ho dem", "Ten", "Ngay sinh", "Ngay vao lam");
    }
    
    public void xuatDL() {
        System.out.printf("%-15s %-10s %15s %15s%n", hoDem, tenNV, ngaySinh, ngayVaoLam);
    }
}
