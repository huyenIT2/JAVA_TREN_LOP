package HoaDon_KhachHang_SVThucHanh;
import java.util.Scanner;

public class HoaDonDemo {
    static HoaDon hd=new HoaDon();
    public static void main(String[] args) {        
        //chỉnh sửa mở rộng làm đẹp hàm main
        Scanner sc= new Scanner(System.in);
        System.out.println("==============Quan ly xe==============");
        int chon;
        do{
            System.out.print("1\tNhap Hóa đơn\n");
            System.out.print("2\tin danh Hóa đơn\n");
            System.out.print("3\ttim kiem Hàng co số lượng nhỏ nhất\n");            
            System.out.print("4\tSắp xếp ds Hàng theo tên\n");           
            System.out.print("5\tthoat\n");
            
            chon=sc.nextInt();
            switch(chon){
            case 1: 
                hd.nhap();break;
            case 2:
                hd.inHD(); break;
            case 3:                
                hd.timMin().inDL();
                break;
            case 4:   
                hd.sapXep();
                break;           
            }
       }    while(chon!=5);    
    }
}

