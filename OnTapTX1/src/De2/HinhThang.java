
package De2;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class HinhThang extends Hinh2Chieu {
    private final int SO_CANH = 4;
    private int chieuCao;
    
    //Quy ước cạnh 1, cạnh 3 là 2 đáy của hình thang

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }
    
    @Override
    public float tinhDT() {
        return (float)1/2 * chieuCao * (dsCanh[0] + dsCanh[2]);       
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        System.out.print("Nhap ma hinh: ");
        maHinh = sc.nextLine();
        dsCanh = new int[SO_CANH];
        //Random cạnh hình thang
        for (int i=0; i<SO_CANH; i++)
            dsCanh[i] = rd.nextInt(50)+1;    
        //Random chiều cao
        chieuCao = rd.nextInt(50)+1;   
    }

    public static void inTieuDe() {
        System.out.printf("%-12s %12s %12s %12s %12s %12s %12s %12s%n", "Ma hinh", "Canh 1", "Canh 2","Canh 3", "Canh4", "Chieu cao", "Dien tich", "Chu vi");
    }
    
    @Override
    public void output() {
        System.out.printf("%-12s %12d %12d %12d %12d %12d %12.2f %12d%n", maHinh, dsCanh[0], dsCanh[1], dsCanh[2], dsCanh[3],chieuCao, tinhDT(), tinhCV());
    }
    
}
