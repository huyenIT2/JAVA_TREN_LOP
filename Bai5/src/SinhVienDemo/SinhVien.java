
package SinhVienDemo;

import java.util.Scanner;
public class SinhVien {
    String ten;
    int tuoi;
    public void setTen(String ten) {
        this.ten = ten;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }    
    void nhap() {                        
        Scanner s = new Scanner(System.in);
        System.out.print("Nhap Ten: ");
        setTen(s.nextLine());
        System.out.print("Nhap Tuoi : ");
        setTuoi(s.nextInt());                 
    }
    @Override
    public String toString() {
        return "SinhVien0{" + "ten=" + ten + ", tuoi=" + tuoi + '}';
    }       
}
