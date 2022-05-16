package Phieu1_Bai1;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhChuNhat {
    private float dai, rong;
    
    public float tinhChuVi() {
        return (dai + rong) * 2;
    }
    
    public float tinhDienTich() {
        return dai * rong;
    }
    
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap chieu dai: ");
        dai = sc.nextFloat();
        System.out.print("Nhap chieu rong: ");
        rong = sc.nextFloat();
    }
    
    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s%n", "Chieu dai", "Chieu rong", "Chu vi", "Dien tich");
    }
    
    public void xuat() {
        System.out.printf("%15.1f %15.1f %15.1f %15.1f%n", dai, rong, tinhChuVi(), tinhDienTich());
    }
    
    public static void main(String[] args) {
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        HinhChuNhat.inTieuDe();
        hcn.xuat();
    }
}
