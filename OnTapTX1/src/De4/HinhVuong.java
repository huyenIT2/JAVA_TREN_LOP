package De4;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhVuong extends DaGiac {
    private final int SO_CANH = 4;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }
  
    @Override
    public float tinhCV() {
        return dsCanh[0] * 4;
    }

    @Override
    public float tinhDT() {
        return dsCanh[0] * dsCanh[0];
    }

    @Override
    public void nhapDL() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap ma hinh: ");
        maHinh = sc.nextLine();
        dsCanh = new int[SO_CANH];
        //Random cạnh hình vuông
        dsCanh[0] = rd.nextInt(100)+1;
        for (int i=1; i<SO_CANH; i++)
            dsCanh[i] = dsCanh[0];       
    }
    
    public static void inTieuDe() {
        System.out.printf("%-12s %12s %12s %12s%n", "Ma hinh", "Do dai canh", "Chu vi", "Dien tich");
    }
    
    public void xuat() {
        System.out.printf("%-12s %12d %12.2f %12.2f%n", maHinh, dsCanh[0], tinhCV(), tinhDT());
    }
}
