package Phieu6;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public abstract class HangHoa {
    protected String maHang;
    protected String tenHang;
    protected String ghiChu;
    protected double donGia;
    protected int soLuongTon;
    protected double VAT;
    
    public abstract  String danhGiaMucDoBan();
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hang: ");
        maHang = sc.nextLine();
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
        System.out.print("Nhap so luong ton: ");
        soLuongTon = sc.nextInt();
    }
    
    static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s", "Ma hang", "Ten hang", "Don gia", "So luong", "VAT");
    }
    
    public void inDL() {
        System.out.printf("%10s %10s %10.1f %10s %10.1f", maHang, tenHang, donGia, soLuongTon, VAT);
    }
}
