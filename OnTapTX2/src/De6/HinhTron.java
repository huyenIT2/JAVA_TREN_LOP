
package De6;

import java.util.Objects;
import java.util.concurrent.ThreadLocalRandom;

/**
 *
 * @author Huyen
 */
public class HinhTron {
    private int banKinh;
    private String maHinh;

    public int getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(int banKinh) {
        this.banKinh = banKinh;
    }

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }

    public void nhap() {
//        Random rd = new Random();
//        maHinh = "HT-" + (rd.nextInt(10)+11);
//        banKinh = rd.nextInt(100)+101;

//        maHinh = "HT-" + (int) (Math.random()*10 + 10);
//        banKinh = (int) (Math.random()*100 + 100);

        maHinh = "HT-" + ThreadLocalRandom.current().nextInt(11, 99);
        banKinh = ThreadLocalRandom.current().nextInt(101, 999);
    }
    
    public static void inTieuDe() {
        System.out.printf("%20s %20s%n", "Ma hinh", "Ban kinh");
    }
    
    public void xuat() {
        System.out.printf("%20s %20d%n", maHinh, banKinh);
    }
    
    @Override
    public int hashCode() {
        int hash = 5;
        hash = 31 * hash + this.banKinh;
        hash = 31 * hash + Objects.hashCode(this.maHinh);
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
