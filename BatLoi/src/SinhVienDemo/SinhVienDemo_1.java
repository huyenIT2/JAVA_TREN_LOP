package SinhVienDemo;

public class SinhVienDemo_1 {
    static String fileName="src/SinhVienDemo/SinhVien.txt";
    //d:/sinhvien.txt
    static DBEngine db=new DBEngine();
    public static void main(String[] args)  {        
        SinhVien v=new SinhVien();             
       //đọc file nếu đã có dữ liệu
        v.nhap();
        System.out.println("DL sau khi nhập");
        System.out.println(v);
        try {
            db.LuuFile(fileName, v);
        } catch (Exception ex) {
           // Logger.getLogger(SinhVienDemo.class.getName()).log(Level.SEVERE, null, ex);
            System.out.print("lỗi ghi file");
        }
        try {
            v=(SinhVien) db.docFile(fileName);
            System.out.print("file sau khi đọc:" );
            System.out.println(v);
        } catch (Exception ex) {
             System.out.print("lỗi đọc file");
//            Logger.getLogger(SinhVienDemo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
