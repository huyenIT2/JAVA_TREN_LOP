package SinhVienDemo;

public class SinhVienDemo {
    public static void main(String[] args)  {        
        SinhVien v=new SinhVien();             
       //đọc file nếu đã có dữ liệu
        v.nhap();
        System.out.println("DL sau khi nhập");
        System.out.println(v);
     }
    
}
