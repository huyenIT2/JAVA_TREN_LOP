
package De4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhTamGiac implements Comparable<HinhTamGiac>{
    private int a, b, c;
    private String maHinh;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh == null || maHinh.compareTo("") == 0) throw new Exception("Ma hinh khong duoc rong");
        this.maHinh = maHinh;
    }
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        a = rd.nextInt(100);
        b = rd.nextInt(100);
        c = rd.nextInt(100);
        while (true) {
            try {
                System.out.print("Nhap ma hinh: ");
                setMaHinh(sc.nextLine());
                break;
            } 
            catch (Exception e){
                System.out.println("Co loi" + e.toString());
            }
        }       
    }
    
    static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %n", "Ma hinh", "Canh 1", "Canh 2", "Canh 3");
    }
    
    public void xuat() {
        System.out.printf("%15s %15s %15s %15s %n", maHinh, a, b, c);
    }

    @Override
    public int compareTo(HinhTamGiac o) {
        return this.getMaHinh().compareToIgnoreCase(o.getMaHinh());
    }
}
