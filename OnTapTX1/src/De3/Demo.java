package De3;

import java.util.Arrays;
import java.util.Comparator;

/**
 *
 * @author Huyen
 */
public class Demo {
    static final int SOTAMGIAC = 7;
    static TamGiacCan myTGC[] = new TamGiacCan[SOTAMGIAC];
    
    static boolean kiemTraMaHinh(String mh, int vt) {
        int dem=0;
        for (int i=0; i<=vt; i++) {
            if (myTGC[i].getMaHinh()!=null && myTGC[i].getMaHinh().compareTo(mh) == 0)
                dem++;
        }
        return dem != 2;             
    }
    
    static void input() {
        for (int i=0; i<SOTAMGIAC; i++){
            System.out.println("Nhap tam giac thu " + (i+1) + ": ");
            myTGC[i] = new TamGiacCan();
            do {
                myTGC[i].input();
                if (!kiemTraMaHinh(myTGC[i].getMaHinh(), i))
                    System.out.println("Ma hinh trung. Moi ban nhap lai.");
            } while(!kiemTraMaHinh(myTGC[i].getMaHinh(), i));
        }
    }
    
    static void output() {
        TamGiacCan.inTieuDe();
        for (int i=0; i<SOTAMGIAC; i++)
            myTGC[i].output();
    }
    
    static float timMax() {
        float maxx = myTGC[0].tinhDT();
        for (int i=1; i<SOTAMGIAC; i++)
            maxx = Math.max(maxx, myTGC[i].tinhDT());
        return maxx;
    }
    
    //Hiển thị tam giác cân có diện tích lớn nhất
    static void HienThiTGCMax() {
        System.out.println("==================TAM GIAC CAN CO DIEN TICH LON NHAT=================");
        TamGiacCan.inTieuDe();
        float maxx = timMax();
        for (int i=0; i<SOTAMGIAC; i++)
            if (myTGC[i].tinhDT() == maxx)
                myTGC[i].output();
    }
    
//    static void SX() {
//        System.out.println("==================DANH SACH TAM GIAC CAN SAU KHI SAP XEP==================");
//        for (int i=0; i<SOTAMGIAC-1; i++) {
//            for (int j=i+1; j<SOTAMGIAC; j++) {
//                if (myTGC[i].getMaHinh() > myTGC[j].getMaHinh()) {
//                    TamGiacCan tg = myTGC[i];
//                    myTGC[i] = myTGC[j];
//                    myTGC[j] = tg;
//                }
//            }
//        }
//        output();
//    }
    
    static void SX2() {
        Comparator<TamGiacCan> c = new Comparator<TamGiacCan>() {
            @Override
            public int compare(TamGiacCan o1, TamGiacCan o2) {
                return o1.getMaHinh().compareToIgnoreCase(o2.getMaHinh());
            }
        };
        Arrays.sort(myTGC, c);
        
    }
    public static void main(String[] args) {
        input();
        System.out.println("==================DANH SACH TAM GIAC CAN==================");
        output();
        HienThiTGCMax();
        System.out.println("==================DANH SACH TAM GIAC CAN SAU KHI SAP XEP==================");
        SX2();
        output();
    }
}
