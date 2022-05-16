
package De6;

import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Huyen
 */
public class HinhTron {
    private int banKinh;
    private String maHinh;

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }
    
    public void nhap() {
        banKinh = ThreadLocalRandom.current().nextInt(101, 999);
        maHinh = "HT-" + ThreadLocalRandom.current().nextInt(11,99);
    }
    
    static void inTieuDe() {
        System.out.printf("%15s %15s %n", "Ma hinh", "Ban kinh");
    }
    
    public void xuat() {
        System.out.printf("%15s %15d %n", maHinh, banKinh);
    }

    @Override
    public int hashCode() {
        int hash = 7;
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
