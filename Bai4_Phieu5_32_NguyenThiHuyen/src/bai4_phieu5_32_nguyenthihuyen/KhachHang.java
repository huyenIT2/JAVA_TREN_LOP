package bai4_phieu5_32_nguyenthihuyen;
import java.util.Scanner;
/**
 *
 * @author Huyen
 */
public class KhachHang {
    private String hoTen, diaChi;
    
    //Nhập các thuộc tính
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ho ten: ");
        hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        diaChi = sc.nextLine();
    }

    @Override
    public String toString() {
        return "Khach hang: " + hoTen +  "\t\tDia chi: " + diaChi;
    }
    
}
