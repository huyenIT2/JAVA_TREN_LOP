package De4;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Demo {
    static int n; //Số hình vuông
    static HinhVuong myHV[];
    static Scanner sc = new Scanner(System.in);
    
    static boolean kiemTraMaHinh(String mh, int vt) {
        int dem=0;
        for (int i=0; i<=vt; i++) {
            if (myHV[i].getMaHinh()!=null && myHV[i].getMaHinh().compareTo(mh) == 0)
                dem++;
        }
        return dem != 2;             
    }
   
    static void nhap() {       
        do {
            System.out.print("Nhap so hinh vuong: ");
            n = sc.nextInt();
            if (n >= 10)
                System.out.println("So hinh vuong < 10. Moi ban nhap lai!");
        } while (n >= 10);
        myHV = new HinhVuong[n];
        
        for (int i=0; i<n; i++) {
            System.out.println("*Nhap hinh vuong thu " + (i+1) + ": ");
            myHV[i] = new HinhVuong();
            do {
                myHV[i].nhapDL();
                if (!kiemTraMaHinh(myHV[i].getMaHinh(), i))
                    System.out.println("Ma hinh trung. Moi ban nhap lai.");
            } while(!kiemTraMaHinh(myHV[i].getMaHinh(), i));
        }        
    }
    
    static void xuat() {
        HinhVuong.inTieuDe();
        for (int i=0; i<n; i++)
            myHV[i].xuat();
    }
    
    static void suaTT() {
        String mh;
        int vt = -1;
        sc.nextLine();
        System.out.print("Nhap ma hinh can tim: ");
        mh = sc.nextLine();      
        
        for (int i=0; i<n; i++)
            if (myHV[i].getMaHinh().compareTo(mh) == 0) {
                vt = i;
                break;
            }
        if (vt == -1)
            System.out.println("Hinh vuong ma " + mh + " khong ton tai.");
        else {
            System.out.println("=>Sua thong tin hinh: ");
            HinhVuong hv = new HinhVuong();
            hv.nhapDL();
            myHV[vt] = hv;            
        }
    }
    
    static float timMax() {
        float maxx = myHV[0].tinhCV();
        for (int i=1; i<n; i++)
            maxx = Math.max(maxx, myHV[i].tinhCV());
        return maxx;
    }
    
    //Hiển hình vuông có chu vi lớn nhất
    static void hienThiHVMax() {
        System.out.println("============HINH VUONG CO CHU VI LON NHAT============");
        HinhVuong.inTieuDe();
        float maxx = timMax();
        for (int i=0; i<n; i++)
            if (myHV[i].tinhCV() == maxx)
                myHV[i].xuat();
    }
    
    static void sapXep() {
        Comparator<HinhVuong> c = new Comparator<HinhVuong>() {
            @Override
            public int compare(HinhVuong o1, HinhVuong o2) {
                return o1.getMaHinh().compareToIgnoreCase(o2.getMaHinh());
            }
        };
        Arrays.sort(myHV, c);
        
    }
    
    public static void main(String[] args) {
        nhap();
        System.out.println("================DANH SACH HINH VUONG================");
        xuat();
        suaTT();
        System.out.println("==========DANH SACH HINH VUONG SAU KHI SUA==========");
        xuat();
        hienThiHVMax();
        System.out.println("========DANH SACH HINH VUONG SAU KHI SAP XEP========");
        sapXep();
        xuat();
    }
    
}
