package bai4_phieu3_lop007_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhVuong extends HinhPhang{
    private double a;

    @Override
    public double tinhChuVi() {
        return a * 4;
    }

    @Override
    public double tinhDienTich() {
        return a * a;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap do dai canh: ");
        a = sc.nextDouble();
    }

    @Override
    public String toString() {
        return "HinhVuong{" + "Chu vi = " + tinhChuVi() + ", dien tich = " + tinhDienTich() + '}';
    }
}
