package bai4_phieu3_lop007_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhTron extends HinhPhang{
    private double banKinh;

    @Override
    public double tinhChuVi() {
       return banKinh * 2 * Math.PI;
    }

    @Override
    public double tinhDienTich() {
        return banKinh * banKinh * Math.PI;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "HinhTron{" + "Chu vi = " + tinhChuVi() + ", dien tich = " + tinhDienTich() + '}';
    }
}
