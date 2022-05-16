package bai4_phieu3_lop007_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhChuNhat extends HinhPhang {
    private double chieuDai;
    private double chieuRong;

    @Override
    public double tinhChuVi() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public double tinhDienTich() {
        return chieuDai * chieuRong;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        chieuDai = sc.nextDouble();
        System.out.print("Nhap chieu rong: ");
        chieuRong = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "HinhChuNhat{" + "Chu vi = " + tinhChuVi() + ", dien tich = " + tinhDienTich() + '}';
    }
    
    
    
}
