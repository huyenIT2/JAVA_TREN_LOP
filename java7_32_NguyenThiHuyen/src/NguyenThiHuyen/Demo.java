package NguyenThiHuyen;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Demo {
    static int soHCN;
    static HinhCN myHCN[];
    static Scanner sc = new Scanner(System.in);
    
    static void nhap() {
        do {
            System.out.print("Nhap so HCN: ");
            soHCN = sc.nextInt();
            if (soHCN > 10)
                System.out.println("So HCN <= 10. Moi ban nhap lai!");
        } while (soHCN > 10);
        myHCN = new HinhCN[soHCN];
        
        for (int i=0; i<soHCN; i++) {
            myHCN[i] = new HinhCN();
            myHCN[i].input();
        }
    } 
    
    static void xuat() {
        HinhCN.inTieuDe();
        for (int i=0; i<soHCN; i++)
            myHCN[i].output();
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
                myHCN[i].output();
    }
    
    //Sắp xếp tăng dần theo mã hình
    static void sapXep() {
        Comparator<HinhCN> c = new Comparator<HinhCN>() {
            @Override
            public int compare(HinhCN o1, HinhCN o2) {
                return o1.getMaHinh().compareToIgnoreCase(o2.getMaHinh());
            }
        };
        Arrays.sort(myHCN, c);        
    }
     
    public static void main(String[] args) {
        nhap();
        System.out.println("======================DANH SACH HINH CHU NHAT=====================");
        xuat();
        hienThiHCNMax();
        System.out.println("==============DANH SACH HINH CHU NHAT SAU KHI SAP XEP=============");
        sapXep();
        xuat();
    }
}
