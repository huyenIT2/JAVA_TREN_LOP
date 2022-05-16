package phieu4_bai2_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
abstract class HoaDon implements KhachHang{
    protected String maKH;
    protected String hoTen;
    NgayThang ngayRaHD = new NgayThang(1,1,2020);
    protected float soLuong;
    protected float donGia;

    public void setMaKH(String maKH) throws Exception {
        if (maKH == null || maKH.compareTo("") == 0)  throw new Exception("Ma KH khong duoc rong");
        this.maKH = maKH;
    }

    public void setSoLuong(float soLuong) throws Exception {
        if (soLuong < 0) throw new Exception("so luong >= 0");
        this.soLuong = soLuong;
    }

    public void setDonGia(float donGia) throws Exception {
        if (donGia < 0) throw new Exception("Don gia >= 0");
        this.donGia = donGia;
    }
      
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Nhap ma KH: ");
                setMaKH(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Co loi " + e.toString());
            }  
        } 
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap ngay ra HD: ");
        ngayRaHD = new NgayThang(sc.nextInt(), sc.nextInt(), sc.nextInt());
        while(true) {
            try {
                System.out.print("Nhap so luong: ");
                setSoLuong(sc.nextFloat());
                break;
            } catch (Exception e) {
                System.out.println("Co loi " + e.toString());
            }  
        }
        while(true) {
            try {
                System.out.print("Nhap don gia: ");
                setDonGia(sc.nextFloat());
                break;
            } catch (Exception e) {
                System.out.println("Co loi " + e.toString());
            }  
        } 
    }
    
    public static void inTieuDe() {
        System.out.printf("%10s %10s %10s %10s %10s", "Ma KH", "Ho ten", "Ngay ra HD", "So luong", "Don gia");
    }
    
    public void xuatDL() {
        System.out.printf("%10s %10s %10s %10s %10s", maKH, hoTen, ngayRaHD, soLuong, donGia);
    }
}

