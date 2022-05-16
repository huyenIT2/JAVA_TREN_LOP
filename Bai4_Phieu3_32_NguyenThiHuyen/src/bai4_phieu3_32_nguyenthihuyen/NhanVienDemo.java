package bai4_phieu3_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVienDemo {
    static NhanVien dsnv[];
    static int n; //Số nhân viên
    
    static void nhapDSNV() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so NV: ");
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
        NhanVien.xuatTieuDe();
        for (NhanVien nv : dsnv)
            nv.inDL();
    }
    
    public static void main(String[] args) {
        nhapDSNV();
        inDSNV();
    }
    
}
