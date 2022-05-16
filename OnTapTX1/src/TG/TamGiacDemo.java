package TG;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class TamGiacDemo {
    static int soTG;
    static TamGiac myTG[];
    static Scanner sc = new Scanner(System.in);
    
    static void nhap() {
        do {
            System.out.print("Nhap so tam giac: ");
            soTG = sc.nextInt();
            if (soTG > 10) 
                System.out.println("So tam giac <= 10. Moi ban nhap lai.");
        } while (soTG > 10);
        myTG = new TamGiac[soTG];
        
        for (int i=0; i<soTG; i++) {
//            System.out.println("*Nhap tam giac thu " + (i+1) + ": ");
            myTG[i] = new TamGiac();
            myTG[i].nhap();
        }
    }
    
    static void xuat() {
        TamGiac.inTieuDe();
        for (int i=0; i<soTG; i++)
            myTG[i].xuat();
    }
    
    static float timMax() {
        float maxx = myTG[0].tinhCV();
        for (int i=1; i<soTG; i++)
            maxx = Math.max(maxx, myTG[i].tinhCV());
        return maxx;
    }
    
    //Hiển thị tam giác có chu vi lớn nhất
    static void hienThiTGMax() {
        System.out.println("==================TAM GIAC CO CHU VI LON NHAT=================");
        TamGiac.inTieuDe();
        float maxx = timMax();
        for (int i=0; i<soTG; i++)
            if (myTG[i].tinhCV() == maxx)
                myTG[i].xuat();
    }
    
    static float timMin() {
        float minn = myTG[0].tinhCV();
        for (int i=1; i<soTG; i++)
            minn = Math.min(minn, myTG[i].tinhCV());
        return minn;
    }
    
    //Hiển thị tam giác có chu vi nhỏ nhất
    static void hienThiTGMin() {
        System.out.println("==================TAM GIAC CO CHU VI NHO NHAT=================");
        TamGiac.inTieuDe();
        float minn = timMin();
        for (int i=0; i<soTG; i++)
            if (myTG[i].tinhCV() == minn)
                myTG[i].xuat();
    }
    
    public static void main(String[] args) {
        nhap();
        System.out.println("======================DANH SACH TAM GIAC======================");
        xuat();
        hienThiTGMax();
        hienThiTGMin();
    }
}
