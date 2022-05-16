
package De4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.TreeSet;

/**
 *
 * @author Huyen
 */
public class Demo {
    static TreeSet<HinhTamGiac> myTG = new TreeSet<>();
    static Scanner sc = new Scanner(System.in);
    
    static void nhap() {
        while (true) {
            HinhTamGiac htg = new HinhTamGiac();
            htg.nhap();
            if (htg.getMaHinh().compareTo("0") == 0) {
                System.out.println("Ma hinh = 0. Dung nhap!");
                break;
            }
            myTG.add(htg);
        }
    }
    
    static void xuat() {
        HinhTamGiac.inTieuDe();
        for (HinhTamGiac htg : myTG)
            htg.xuat();
    }
    
    static void sapXep() {
        ArrayList arr = new ArrayList<>(myTG);
        Collections.sort(arr, new Comparator<HinhTamGiac>() {
            @Override
            public int compare(HinhTamGiac o1, HinhTamGiac o2) {
                return o1.getMaHinh().compareToIgnoreCase(o2.getMaHinh());
            }         
        });
        myTG.clear();
        myTG.addAll(arr);
        
        System.out.println("\t=> DANH SACH HINH TAM GIAC SAU KHI SAP XEP");
        xuat(); 
    }
    
    static void them() {
        System.out.println("Nhap thong tin hinh can them: ");
        HinhTamGiac t = new HinhTamGiac();
        t.nhap();
        
        System.out.print("Nhap vi tri can them: ");
        int vt = sc.nextInt();
        
        ArrayList arr = new ArrayList<>(myTG);
        arr.add(vt, t);
        myTG.clear();
        myTG.addAll(arr);
        
        System.out.println("\t=> DANH SACH HINH TAM GIAC SAU KHI THEM");
        xuat(); 
    }
    
    public static void main(String[] args) {
        nhap();
        System.out.println("\t=====DANH SACH HINH TAM GIAC=====");
        xuat();     
        sapXep();
        them();
    }
}
