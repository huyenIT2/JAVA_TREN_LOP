package bai4_phieu5_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HoaDonDemo {
    static HoaDon hd = new HoaDon();
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Nhap hoa don: ");
        hd.nhap();
        System.out.println("2. Hien thi hoa don: ");
        hd.inHD();
        System.out.println("3. Sap xep giam dan theo ten hang: ");
        hd.sapXepTheoTen();
        hd.inHD();
        System.out.println("4. Sap xep giam dan theo so luong: ");
        hd.sapXepTheoSoLuong();
        hd.inHD();
    }
}
