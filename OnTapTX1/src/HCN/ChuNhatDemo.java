package HCN;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class ChuNhatDemo {
    static int soHCN;
    static HinhCN myHCN[];
    static Scanner sc = new Scanner(System.in);
    
    static boolean kiemTraMaHinh(int id, int vt) {
        for (int i=0; i<=vt; i++)
            if (myHCN[i].getMaHinh()!=null && myHCN[i].getMaHinh().compareTo("CN" + id) == 0)
                return false;
        return true;             
    }
    
    static void nhap() {
        do {
            System.out.print("Nhap so HCN: ");
            soHCN = sc.nextInt();
            if (soHCN > 10)
                System.out.println("So HCN <= 10. Moi ban nhap lai!");
        } while (soHCN > 10);
        myHCN = new HinhCN[soHCN];

        for (int i=0; i<soHCN; i++) {
//            System.out.println("*Nhap HCN thu " + (i+1) + ":");
            myHCN[i] = new HinhCN();
            int id;
            do {
                id = (int)(Math.random()*10+1);
                if (!kiemTraMaHinh(id, i)){
                    System.out.println("Ma hinh trung, random lai");
                }
            } while(!kiemTraMaHinh(id, i));           
            myHCN[i].setMaHinh("CN" + id);
            myHCN[i].nhap();
        }
    }
    
    static void xuat() {
        HinhCN.inTieuDe();
        for (int i=0; i<soHCN; i++)
            System.out.println(myHCN[i]);
    }
    
    static int timMax() {
        int maxx = myHCN[0].tinhDT();
        for (int i=1; i<soHCN; i++)
            maxx = Math.max(maxx, myHCN[i].tinhDT());
        return maxx;
    }
    
    //Hiển thị hình chữ nhật có diện tích lớn nhất
    static void hienThiHCNMax() {
        System.out.println("================HINH CHU NHAT CO DIEN TICH LON NHAT===============");
        HinhCN.inTieuDe();
        int maxx = timMax();
        for (int i=0; i<soHCN; i++)
            if (myHCN[i].tinhDT() == maxx)
                System.out.println(myHCN[i]);
    }
    
    static int timMin() {
        int minn = myHCN[0].tinhDT();
        for (int i=1; i<soHCN; i++)
            minn = Math.min(minn, myHCN[i].tinhDT());
        return minn;
    }
    
    //Hiển thị HCN có diện tích nhỏ nhất
    static void hienThiHCNMin() {
        System.out.println("================HINH CHU NHAT CO DIEN TICH NHO NHAT===============");
        HinhCN.inTieuDe();
        int minn = timMin();
        for (int i=0; i<soHCN; i++)
            if (myHCN[i].tinhDT() == minn)
                System.out.println(myHCN[i]);
    }
    
    public static void main(String[] args) {
        nhap();
        System.out.println("======================DANH SACH HINH CHU NHAT=====================");
        xuat();
        hienThiHCNMax();
        hienThiHCNMin();
    }
}
