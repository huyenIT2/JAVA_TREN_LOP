package Phieu1_Bai2;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhTron {
    private float banKinh;
    
    public float chuVi() {
        return (float) (banKinh * 2 * Math.PI);
    }
    
    public float dienTich() {
        return (float) (banKinh * banKinh * Math.PI);
    }
    
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
    }
    
    public static void inTieuDe() {
        System.out.printf("%15s %15s %15s%n", "Ban kinh", "Chu vi", "Dien tich");
    }
    
    public void xuat() {
        System.out.printf("%15.1f %15.1f %15.1f%n", banKinh, chuVi(), dienTich());
    }
    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.print("Nhap so hinh tron: ");
        n = sc.nextInt();
        HinhTron ht[] = new HinhTron[n];
        for (int i=0; i<n; i++) {
            ht[i] = new HinhTron();
            System.out.println("- Hinh tron thu " + (i+1) + ": ");
            ht[i].nhap();
        }
        HinhTron.inTieuDe();
        for (int i=0; i<n; i++)
            ht[i].xuat();
    }
}
