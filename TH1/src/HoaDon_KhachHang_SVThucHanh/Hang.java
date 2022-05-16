package HoaDon_KhachHang_SVThucHanh;

import java.util.Scanner;

public class Hang {
    private String tenHang;
    private double soLuong;
    private double donGia;
    /**
     * nhập thuộc tính tên hàng, số lượng, đơn giá
     */
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ten hang: ");
        tenHang = sc.nextLine();
        System.out.println("Nhap so luong: ");
        soLuong = sc.nextDouble();
        System.out.println("Nhap don gia: ");
        donGia = sc.nextDouble();
    }
    /**
     * 
     * @return số lượng* đơn giá
     */
    public double tinhTongTien(){
        return soLuong*donGia;
    }
    /**
     * bổ sung xâu định dạng tương ứng với các 4 dữ liệu
     * @biểu diễn các tiêu đề cho cột hàng trong hóa đơn
     */
    static void inTieuDe(){
        System.out.printf("%10s %10s %10s %15s %n",
                "ten hang", "so luong","don gia",
                "thanh tien");
    }
   /**
    * bổ sung xâu định dạng in dữ liệu thẳng hàng với tiêu đề
    */
    public void inDL(){
        System.out.printf("%10s %10.1f %10.1f %15.0f %n",
                tenHang,soLuong,donGia,tinhTongTien());
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
