package HoaDon_KhachHang_SVThucHanh;
import java.text.DecimalFormat;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
public class HoaDon {
    private String soHD;
    private int soMatHang;
    private KhachHang kh = new KhachHang();
    private Hang dsHang[];
    NgayThang ngayHD=new NgayThang(1,1,2020);
    /**
     * Nhập số HĐ,
     * nhập số mặt hàng n;
     * nhập khách
     *  xin cấp phát mảng; nhập mảng hàng.
     * nhập ngày 
     */
    public void nhap(){   
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so HD: ");
        soHD = sc.nextLine();
        System.out.println("Nhap ngay lap: ");
        ngayHD = new NgayThang(sc.nextInt(), sc.nextInt(), sc.nextInt());
        System.out.println("Nhap khach hang: ");
        kh.nhap();
        System.out.println("Nhap DS khach hang: ");
        System.out.println("Nhap so mat hang: ");
        soMatHang = sc.nextInt(); //Nhập số phần tử mảng
        dsHang = new Hang[soMatHang]; //xin cấp phát mảng
        for (int i=0; i<soMatHang; i++){
            System.out.println("Nhap mat hang thu " + (i+1));
            dsHang[i] = new Hang(); //xin cấp phát phần tử i
            dsHang[i].nhap(); // gọi hàng nhâ
        }
    }// end of nhap()
    public double tinhTongTien(){
        //sv tự làm tính tổng số lượng*đơn giá
        double tongTien = 0;
        for (int i=0; i<soMatHang; i++)
            tongTien += dsHang[i].tinhTongTien();
        return tongTien;
    }
    public void inHD()   { 
        DecimalFormat df=new DecimalFormat("###,###.0#");    
        //in số hoá đơn, ngày lập
        System.out.println("soHD: "+soHD + "\t\t " + "Ngay lap: " + ngayHD.toString() );
        System.out.println(kh.toString());
        System.out.println("Danh sach hang hoa: ");
        Hang.inTieuDe();
        for (int i=0; i<soMatHang; i++)
            dsHang[i].inDL();
        System.out.println("-------------------");
        System.out.println("Tong tien: " + df.format(tinhTongTien()));
                
        
    } 
    /**
     * Sắp xếp danh sách hàng hóa theo 1 tiêu chí bất kỳ
     * public int compare trả lại
     * 0 nếu đưa tiêu chi so sánh t =t1
     * >0 nếu t>t1
     * <0 nếu t<t1
     */
    public void sapXep(){   
        Comparator<Hang> c1 = new Comparator<Hang>() {
            @Override
            public int compare(Hang t, Hang t1) {
               return t.getTenHang().compareToIgnoreCase(t1.getTenHang());
            }
        };
        Arrays.sort(dsHang, c1);
    }
    public  Hang timMin(){
         Comparator<Hang> c = new Comparator<Hang>() {
             @Override
             public int compare(Hang t, Hang t1) {
                 //sắp xếp theo số lượng
                 return Double.compare(t.getSoLuong(), t1.getSoLuong());
             }
         };
         System.out.println("So luong min: ");
         return Collections.min(Arrays.asList(dsHang),c);
        };                  
}//end of class
    

