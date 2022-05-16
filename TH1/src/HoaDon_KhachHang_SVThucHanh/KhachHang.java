package HoaDon_KhachHang_SVThucHanh;
import java.util.Scanner;
public class KhachHang {
    private  String maKH;
    private  String hoTen;
    private  String diaChi;
    /**
     * Nhập các thuộc tính: Mã khách, họ tên, địa chỉ   
     */
    public void nhap() {
        //chú ý với scanner khi nhập số- xâu
        Scanner sc=new Scanner(System.in);        
        System.out.println("Nhap ma khach: ");
        maKH = sc.nextLine();
        System.out.println("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.println("Nhap dia chi: ");
        diaChi = sc.nextLine();
    } 
    /** @return : Xâu kết xuất thông tin khách 
     * có định dạng phù hợp như mẫu in trong phiếu hóa đơn
     */
    public String toString() {
        return "KhachHang{" + "maKH=" + maKH + ", hoten=" + hoTen + ", diaChi=" + diaChi + '}';
    }    
}
