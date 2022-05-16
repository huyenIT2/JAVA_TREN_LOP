
package De6;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Demo {
    static LinkedList<HinhTron> myHT = new LinkedList<HinhTron>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        nhap();
        System.out.println("\t\t===DANH SÁCH HÌNH TRÒN===");
        xuat();
        timKiem();
    }
    
    static void nhap() {
        int chon;
        do {
            for (int i=0; i<5; i++) {
                HinhTron ht = new HinhTron();
                ht.nhap();
                myHT.add(ht);
            }
            
            System.out.println("1. Nhap tiep 5 hinh tron, 0. Khong nhap nua");
            System.out.print("Moi ban chon: ");
            chon = sc.nextInt();
            sc.nextLine();
        } while (chon == 1);        
    }
    
    static void xuat() {
        HinhTron.inTieuDe();   
        for (HinhTron h : myHT) {
            h.xuat();
        }
    }
    
    static void timKiem() {
        System.out.print("Nhap ma hinh can tim: ");
        HinhTron ht = new HinhTron();
        ht.setMaHinh(sc.nextLine());
//        String mh = sc.nextLine();
          
        if (myHT.contains(ht)) {
            System.out.println("Khong them duoc.");
            return;
        }   
        System.out.print("Nhap ban kinh: ");
        ht.setBanKinh(sc.nextInt());
        myHT.add(ht);
        
        System.out.println("\t\t===DANH SÁCH HÌNH TRÒN MỚI===");
        xuat();
    }
}
