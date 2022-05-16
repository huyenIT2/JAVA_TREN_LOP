package phieu4_bai2_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class KhachHangDemo {
    static int soKH, loaiKH;
    static HoaDon myKH[];
    static float tongSoLuong1 = 0f, tongSoLuong2 = 0f, tongThanhTien = 0f;
    static int dem = 0;
    
    static void nhapDSKH() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong khach hang: ");
        soKH = sc.nextInt();
        myKH = new HoaDon[soKH];
        for (int i=0; i<soKH; i++) {
            System.out.println("1. Nhap KHVN, 2. Nhap KH nuoc ngoai");
            loaiKH = sc.nextInt();
            if (loaiKH == 1) {
                myKH[i] = new KhachHangVN();
                myKH[i].nhap();
            } 
            else {
                myKH[i] = new KhachHangNuocNgoai();
                myKH[i].nhap();
                dem++;        
                tongThanhTien += myKH[i].tinhTienDien();
            }
        }
    }
    
    static void inDSKH() {
        System.out.println("*Khach hang Viet Nam");
        KhachHangVN.inTieuDe();
        for (int i=0; i<soKH; i++)
            if (myKH[i] instanceof KhachHangVN) {
                myKH[i].xuatDL();
                tongSoLuong1 += myKH[i].soLuong;
            }
        System.out.println("Tong so luong: " + tongSoLuong1);     
        System.out.println("*Khach hang nuoc ngoai");
        KhachHangNuocNgoai.inTieuDe();
        for (int i=0; i<soKH; i++)
            if (myKH[i] instanceof KhachHangNuocNgoai) {
                myKH[i].xuatDL();
                tongSoLuong2 += myKH[i].soLuong;
            }
        System.out.println("Tong so luong: " + tongSoLuong2);                
    }
    
    public static float tinhTB() {
        return tongThanhTien / dem;
    }
    
    public static void hoaDonThang9() {
        System.out.println("DANH SACH HOA DON TRONG THANG 9 NAM 2013");
        System.out.println("*Khach hang Viet Nam");
        KhachHangVN.inTieuDe();
        for (int i=0; i<soKH; i++)
            if (myKH[i] instanceof KhachHangVN && myKH[i].ngayRaHD.thang == 9 && myKH[i].ngayRaHD.nam == 2013)
                myKH[i].xuatDL();
        System.out.println("*Khach hang nuoc ngoai");
        KhachHangNuocNgoai.inTieuDe();
        for (int i=0; i<soKH; i++)
            if (myKH[i] instanceof KhachHangNuocNgoai && myKH[i].ngayRaHD.thang == 9 && myKH[i].ngayRaHD.nam == 2013)
                myKH[i].xuatDL();
    }
    
    public static void main(String[] args) {
        nhapDSKH();
        inDSKH();
        System.out.println("TB thanh tien cua khach hang nuoc ngoai:  " + tinhTB());
        hoaDonThang9();
    }
    
}
