
package De3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.LinkedHashSet;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Demo {
    static LinkedHashSet<HinhTron> myHT = new LinkedHashSet<>();
    static Scanner sc = new Scanner(System.in);
    
    static void nhap() {
        while (true) {
            HinhTron ht = new HinhTron();
            ht.nhap();
            
            if (ht.getBanKinh() == 0) {
                System.out.println("Ban kinh = 0. Dung nhap!");
                return;
            }
            myHT.add(ht);
        }
    }
    
    static void xuat() {
        HinhTron.inTieuDe();
        for (HinhTron ht : myHT)
            ht.xuat();
    }
    
    static void boSung() {
        System.out.print("Nhap ma hinh can tim: ");
        HinhTron ht = new HinhTron();
        ht.setMaHinh(sc.nextLine());
        
        if (myHT.contains(ht)) {
            System.out.println("Khong them duoc!");
            return;
        }
        
        System.out.print("Nhap ban kinh bo sung: ");
        ht.setBanKinh(sc.nextFloat());
        
        ArrayList arr = new ArrayList<>(myHT);
        arr.add(0, ht);
        myHT = new LinkedHashSet<>(arr);
        
        System.out.println("=>Sau khi bo sung: ");
        xuat();
    }
    
    static void sapXep() {
        ArrayList arr = new ArrayList<>(myHT);
        Collections.sort(arr, new Comparator<HinhTron>() {
            @Override
            public int compare(HinhTron o1, HinhTron o2) {
                return o1.getMaHinh().compareToIgnoreCase(o2.getMaHinh());
            }   
        });
        myHT.clear();
        myHT.addAll(arr);
        
        System.out.println("=>Sau khi SX: ");
        xuat();
    }
    
    public static void main(String[] args) {
        nhap();
        xuat();
        boSung();
        sapXep();
    }
}
