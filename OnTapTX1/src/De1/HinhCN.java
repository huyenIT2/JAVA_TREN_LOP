package De1;

import java.util.Random;

/**
 *
 * @author Huyen
 */
public class HinhCN extends HinhPhang implements IO_Intereface {
    private String maHinh;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }
    
    @Override
    public int tinhDT() {
        return dsCanh[0] * dsCanh[1];
    }

    @Override
    public void input() {
        Random rd = new Random();
        int id = (int)(Math.random()*10+1);
        setMaHinh("CN" + id);
        
        soCanh = 4;
        dsCanh = new int[soCanh];
        for (int i=0; i<soCanh; i++) {
            //Random chiều dài
            dsCanh[0] = dsCanh[2] = rd.nextInt(100)+1;
            //Random chiều rộng
            dsCanh[1] = dsCanh[3] = rd.nextInt(100)+1;   
        }            
    }
    
    public static void inTieuDe() {
        System.out.printf("%-12s %12s %12s %12s %12s%n", "Ma hinh", "Chieu dai", "Chieu rong", "Dien tich", "Chu vi");
    }

    @Override
    public void output() {
        System.out.printf("%-12s %12d %12d %12d %12d%n", maHinh, dsCanh[0], dsCanh[1], tinhDT(), tinhCV());
    }
    
}
