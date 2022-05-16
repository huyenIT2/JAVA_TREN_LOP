package bai4_phieu5_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Hang {
    private String tenHang;
    private double soLuong, donGia;
    //Nhập các thuộc tính
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.print("Nhap so luong: ");
        soLuong = sc.nextDouble();
        System.out.print("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    //Tính thành tiền
    public double tinhThanhTien() {
        return soLuong*donGia;
    }
    //In tiêu đề
    static void inTieuDe() {
        System.out.printf("%10s %10s %10s %15s %n", "Ten hang", "So luong", 
                "Don gia", "Thanh tien");
    }
    //In dữ liệu thẳng hàng với tiêu đề
    public void inDL(){
        System.out.printf("%10s %10.1f %10.1f %15.0f %n",
                tenHang,soLuong,donGia,tinhThanhTien());
    }  

    public String getTenHang() {
        return tenHang;
    }

    public void setTenHang(String tenHang) {
        this.tenHang = tenHang;
    }

    public double getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(double soLuong) {
        this.soLuong = soLuong;
    }

    public double getDonGia() {
        return donGia;
    }

    public void setDonGia(double donGia) {
        this.donGia = donGia;
    }
    
}
