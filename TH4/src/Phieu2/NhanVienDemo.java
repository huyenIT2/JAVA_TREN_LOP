package Phieu2;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVienDemo {
    static NhanVien dsnv[];
    static int n;
    
    static void nhapDSNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so nhan vien: ");
        n = sc.nextInt();
        dsnv = new NhanVien[n];
        for (int i=0; i<n; i++) {
            System.out.println("Nhap nhan vien thu " + (i+1) + ": ");
            dsnv[i] = new NhanVien();
            dsnv[i].nhap();
        }
    }
    
    static void inDSNV() {
        System.out.println("DS nhan vien sau khi nhap: ");
        NhanVien.inTieuDe();
        for (NhanVien nv : dsnv)
            nv.xuatDL();
    }
    
    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
    }
}
