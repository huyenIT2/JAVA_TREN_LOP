
package SinhVienDemo;

import java.io.Serializable;
import java.util.Scanner;
public class SinhVien implements Serializable{
    String ten;
    int tuoi;
    //tên khác rỗng
    public void setTen(String ten) {
        this.ten = ten;
    }
    //tuổi >0
    public void setTuoi(int tuoi)throws Exception{         
        if (tuoi<0) throw new Exception("tuổi >0");
        this.tuoi = tuoi;
    }    
    void nhap() {                        
        try {
            Scanner s = new Scanner(System.in);
            System.out.print("Nhap Ten: ");
            setTen(s.nextLine());
            System.out.print("Nhap Tuoi : ");                 
            setTuoi(s.nextInt());
        } catch (Exception ex) {
            System.out.println("có lỗi"+ex.toString());
        }
 }
    @Override
    public String toString() {
        return "SinhVien0{" + "ten=" + ten + ", tuoi=" + tuoi + '}';
    }       
}
