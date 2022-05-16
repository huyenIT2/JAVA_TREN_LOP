
package De1;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhCN {
    private int chieuDai, chieuRong;
    private String maHinh;

    public void setChieuDai(int chieuDai) {
        this.chieuDai = chieuDai;
    }

    public void setChieuRong(int chieuRong) {
        this.chieuRong = chieuRong;
    }
 

    public void setMaHinh(String maHinh) throws Exception {
        if (maHinh == null || maHinh.compareTo("") == 0) throw new Exception("Ma hinh khong duoc rong.");
        this.maHinh = maHinh;
    }
    
    public void nhap() {
        Random rd = new Random();
        Scanner sc = new Scanner(System.in);
        while (true) {
            try {
                System.out.print("Nhap ma hinh: ");
                setMaHinh(sc.nextLine());
                break;
            } 
            catch (Exception e) {
                System.out.println("Co loi" + e.toString());
            }
        }
        chieuDai = rd.nextInt(100);
        chieuRong = rd.nextInt(100);
    }
    
    public int tinhDT() {
        return chieuDai * chieuRong;
    }
    
    static void inTieuDe() {
        System.out.printf("%15s %15s %15s %15s %n", "Ma hinh", "Chieu dai", "Chieu rong", "Dien tich");
    }
    
    public void xuat() {
        System.out.printf("%15s %15d %15d %15d %n", maHinh, chieuDai, chieuRong, tinhDT());
    }

    @Override
    public int hashCode() {
        int hash = 5;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final HinhCN other = (HinhCN) obj;
        return this.maHinh.equalsIgnoreCase(other.maHinh);
    }

    @Override
    public String toString() {
        return "HinhCN{" + "chieuDai=" + chieuDai + ", chieuRong=" + chieuRong + ", maHinh=" + maHinh + ", dienTich=" + tinhDT() + '}';
    }
      
}
