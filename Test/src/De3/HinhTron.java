
package De3;

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Huyen
 */
public class HinhTron {
    private float banKinh;
    private String maHinh;

    public float getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(float banKinh) {
        this.banKinh = banKinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public String getMaHinh() {
        return maHinh;
    }
    
    
    
    public void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ban kinh: ");
        banKinh = sc.nextFloat();
        maHinh = "HT-" + ThreadLocalRandom.current().nextInt(11,99);
    }
    
    static void inTieuDe() {
        System.out.printf("%15s %15s %n", "Ma hinh", "Ban kinh");
    }
    
    public void xuat() {
        System.out.printf("%15s %15.2f %n", maHinh, banKinh);
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
        final HinhTron other = (HinhTron) obj;
        return this.maHinh.equalsIgnoreCase(other.maHinh);
    }
    
    
}
