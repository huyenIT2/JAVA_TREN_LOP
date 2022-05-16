package bai4_phieu5_32_nguyenthihuyen;

import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HoaDon {
    private String soHD, ngayHD;
    private int soMatHang;
    private KhachHang kh = new KhachHang();
    private Hang dsHang[];
    private double tongTienHang = 0;
    //Nhập các thuộc tính
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so HD: ");
        soHD = sc.nextLine();
        System.out.print("Nhap ngay lap: ");
        ngayHD = sc.nextLine();
        System.out.println("*Nhap thong tin khach hang: ");
        kh.nhap();
        System.out.println("*Nhap DS mat hang: ");
        System.out.print("Nhap so mat hang: ");
        soMatHang = sc.nextInt(); //Nhập số phần tử mảng
        dsHang = new Hang[soMatHang]; //Xin cấp phát mảng
        for (int i=0; i<soMatHang; i++) {
            System.out.println("- Nhap mat hang thu " + (i+1));
            dsHang[i] = new Hang(); //Xin cấp phát phần tử i
            dsHang[i].nhap(); //Gọi hàm nhập
        }       
    }
    //Tính tổng tiền
    public double tinhTongTien() {
        for (int i=0; i<soMatHang; i++)
            tongTienHang += dsHang[i].tinhThanhTien();
        return tongTienHang;
    }
    
    public void inHD() {
        DecimalFormat df=new DecimalFormat("###,###.0#");    
        System.out.println("MaHD: "+soHD + "\t\t\t " + "Ngay ban: " + ngayHD);
        System.out.println(kh.toString());
        Hang.inTieuDe();
        for (int i=0; i<soMatHang; i++)
            dsHang[i].inDL();
        System.out.println("Tong tien: " + df.format(tinhTongTien()));
    }
    
    //Sắp xếp giảm dần theo tên hàng
    public void sapXepTheoTen() {
        Comparator<Hang> c1 = new Comparator<Hang>() {
            @Override
            public int compare(Hang t, Hang t1) {
                return - t.getTenHang().compareToIgnoreCase(t1.getTenHang());
            }
        };
        Arrays.sort(dsHang, c1);
    }
    //Sắp xếp giảm dần theo số lượng
    public void sapXepTheoSoLuong() {
        Comparator<Hang> c1 = new Comparator<Hang>() {
            @Override
            public int compare(Hang t, Hang t1) {
                if (t.getSoLuong() - t1.getSoLuong() > 0)
                    return -1;
                else if ((t.getSoLuong() - t1.getSoLuong() < 0))
                    return 1;
                else 
                    return 0;
            }
        };
        Arrays.sort(dsHang, c1);             
    }
}
