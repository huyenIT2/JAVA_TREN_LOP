package phieu4_bai2_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
class KhachHangNuocNgoai extends HoaDon implements KhachHang{
    private String quocTich;
    
    @Override
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        super.nhap();
        System.out.print("Nhap quoc tich: ");
        quocTich = sc.nextLine();
    }
    
    @Override
    public float tinhTienDien() {
        return soLuong * donGia;
    }
    
    public static void inTieuDe() {
        HoaDon.inTieuDe();
        System.out.printf("%10s %15s%n", "Quoc tich", "Thanh tien");
    }
    
    @Override
    public void xuatDL() {
        super.xuatDL();
        System.out.printf("%10s %15.2f%n", quocTich, tinhTienDien());
    }
    
    
}
