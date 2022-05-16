package Phieu1_Bai4;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Xe {
    private String tenChuxe;
    private String loaiXe;
    private int dungTich;
    private double triGia;

    public int getDungTich() {
        return dungTich;
    }

    public void setDungTich(int dungTich) {
        this.dungTich = dungTich;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        tenChuxe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaiXe = sc.nextLine();
        System.out.print("Nhap dung tich xe: ");
        dungTich = sc.nextInt();
        System.out.print("Nhap tri gia xe: ");
        triGia = sc.nextDouble();
    }
    
    public double tinhThue() {
        if (dungTich < 100) 
            return triGia/100;
        else if (dungTich < 200)
            return triGia*3/100;
        else 
            return triGia*5/100;
    }
    
    public static void inTieuDe() {
        System.out.printf("%-15s %-15s %15s %15s %15s%n", "Ten chu xe", "Loai xe", "Dung tich", "Tri gia", "Thue phai nop");
    }
    
    public void inDL() {
        System.out.printf("%-15s %-15s %15s %15s %15s%n", tenChuxe, loaiXe, dungTich, triGia, tinhThue());
    }
}
