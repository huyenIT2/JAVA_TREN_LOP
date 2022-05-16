package bai4_phieu3_lop007_32_nguyenthihuyen;

/**
 *
 * @author Huyen
 */
public class HinhDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("---Hinh vuong---");
        HinhVuong hv = new HinhVuong();
        hv.nhap();
        System.out.println(hv);
        
        System.out.println("---Hinh chu nhat---");
        HinhChuNhat hcn = new HinhChuNhat();
        hcn.nhap();
        System.out.println(hcn);
        
        System.out.println("---Hinh tron---");
        HinhTron ht = new HinhTron();
        ht.nhap();
        System.out.println(ht);
    }
    
}
