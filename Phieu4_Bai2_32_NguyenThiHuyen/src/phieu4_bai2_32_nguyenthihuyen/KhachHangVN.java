package phieu4_bai2_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
class KhachHangVN extends HoaDon implements KhachHang {
    private String doiTuong;
    private int dinhMuc;
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        int loaiDoiTuong;
        System.out.print("Nhap doi tuong: 1. sinh hoat, 2. kinh doanh, 3. san xuat ");
        loaiDoiTuong = sc.nextInt();
        switch (loaiDoiTuong) {
            case 1:
                doiTuong = "sinh hoat";
                break;
            case 2:
                doiTuong = "kinh doanh";
                break;
            default:
                doiTuong = "san xuat";
                break;
        }
        System.out.print("Nhap dinh muc: ");
        dinhMuc = sc.nextInt();
    }
    
    @Override
    public float tinhTienDien() {
        if (soLuong <= dinhMuc)
            return soLuong * donGia;
        else
            return soLuong*donGia*dinhMuc + (soLuong-dinhMuc)*donGia*2.5f;
    }
    
    public static void inTieuDe() {
        HoaDon.inTieuDe();
        System.out.printf("%10s %15s %15s%n", "Doi tuong", "Dinh muc", "Thanh tien");
    }
    
    @Override
    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%10s %15s %15.2f%n", doiTuong, dinhMuc, tinhTienDien());
    }
}
