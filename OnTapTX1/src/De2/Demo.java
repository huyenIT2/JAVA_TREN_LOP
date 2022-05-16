
package De2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Demo {
    static int n; //Số hình thang
    static HinhThang myHT[];
    static Scanner sc = new Scanner(System.in);
    
    static boolean kiemTraMaHinh(String mh, int vt) {
        int dem=0;
        for (int i=0; i<=vt; i++) {
            if (myHT[i].getMaHinh()!=null && myHT[i].getMaHinh().compareTo(mh) == 0)
                dem++;
        }
        return dem != 2;             
    }
   
    static void nhap() {       
        do {
            System.out.print("Nhap so hinh thang: ");
            n = sc.nextInt();
            if (n > 15)
                System.out.println("So hinh thang <= 15. Moi ban nhap lai!");
        } while (n >= 10);
        myHT = new HinhThang[n];
        
        for (int i=0; i<n; i++) {
            System.out.println("*Nhap hinh thang thu " + (i+1) + ": ");
            myHT[i] = new HinhThang();
            do {
                myHT[i].input();
                if (!kiemTraMaHinh(myHT[i].getMaHinh(), i))
                    System.out.println("Ma hinh trung. Moi ban nhap lai.");
            } while(!kiemTraMaHinh(myHT[i].getMaHinh(), i));
        }        
    }
    
    static void xuat() {
        HinhThang.inTieuDe();
        for (int i=0; i<n; i++)
            myHT[i].output();
    }
    
    static float timMax() {
        float maxx = myHT[0].tinhDT();
        for (int i=1; i<n; i++)
            maxx = Math.max(maxx, myHT[i].tinhDT());
        return maxx;
    }
    
    //Hiển thị hình thang có diện tích lớn nhất
    static void hienThiHTMax() {
        System.out.println("================HINH THANG CO DIEN TICH LON NHAT===============");
        HinhThang.inTieuDe();
        float maxx = timMax();
        for (int i=0; i<n; i++)
            if (myHT[i].tinhDT() == maxx)
                myHT[i].output();
    }
    
    static void sapXep() {
        Comparator<HinhThang> c = new Comparator<HinhThang>() {
            @Override
            public int compare(HinhThang o1, HinhThang o2) {
                return o2.tinhCV() - o1.tinhCV();
            }
        };
        Arrays.sort(myHT, c);
    }
    
    public static void main(String[] args) {
        nhap();
        System.out.println("================DANH SACH HINH THANG================");
        xuat();
        hienThiHTMax();
        System.out.println("========DANH SACH HINH THANG SAU KHI SAP XEP========");
        sapXep();
        xuat();
    }
}
