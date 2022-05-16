package HCN;

import java.util.Random;

/**
 *
 * @author Huyen
 */
public class HinhCN extends HinhPhang {
    private String maHinh;
    private int chieuDai;
    private int chieuRong;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }
 
    @Override
    public int tinhCV() {
        return (chieuDai + chieuRong) * 2;
    }

    @Override
    public int tinhDT() {
        return chieuDai * chieuRong;
    }

    public void nhap() {
        Random rd = new Random();
        //Random chiều dài
        chieuDai = rd.nextInt(100)+1;
        //Random chiều rộng
        chieuRong = rd.nextInt(100)+1;
        
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Nhap chieu dai: ");
//        chieuDai = sc.nextFloat();
//        System.out.print("Nhap chieu rong: ");
//        chieuRong = sc.nextFloat();
    }
    public static void inTieuDe() {
        System.out.printf("%-12s %12s %12s %12s %12s%n", "Ma hinh", "Chieu dai", "Chieu rong", "Dien tich", "Chu vi");
    }
    @Override
    public String toString() {
        return String.format("%-12s %12d %12d %12d %12d", maHinh, chieuDai, chieuRong, tinhCV(), tinhDT());
    }
    
}
