package De1;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Demo {

    static LinkedList<HinhCN> myHCN = new LinkedList<>();
    static Scanner sc = new Scanner(System.in);

    static boolean checkMaHinh(HinhCN hcn) {
        return myHCN.contains(hcn);
    }

    static void nhap() {
        int soHCN;
        do {
            System.out.print("Nhap so HCN: ");
            soHCN = sc.nextInt();
            sc.nextLine();
            
            if (soHCN > 5) {
                System.out.println("So HCN > 5. Moi ban nhap lai!");
                break;
            }
        } while (soHCN > 5);

        HinhCN h1 = new HinhCN();
        h1.nhap();
        myHCN.add(h1);

        boolean check;
        for (int i = 1; i < soHCN; i++) {
            HinhCN hcn = new HinhCN();
            do {
                hcn.nhap();
                check = checkMaHinh(hcn);
                if (check) {
                    System.out.println("Ma hinh trung, moi nhap lai.");
                }
            } while (check);
            myHCN.add(hcn);
        }
    }

    static void xuat() {
        HinhCN.inTieuDe();
        for (HinhCN hcn : myHCN) {
            hcn.xuat();
        }
    }

    static void sua() {
        while (true) {
            try {
                System.out.print("Nhap ma hinh can tim: ");
                HinhCN hcn = new HinhCN();
                hcn.setMaHinh(sc.nextLine());
                
                int vt = myHCN.indexOf(hcn);
                if (vt != -1) {
                    System.out.print("Nhap CD sua: ");
                    myHCN.get(vt).setChieuDai(sc.nextInt());
                    System.out.print("Nhap CR sua: ");
                    myHCN.get(vt).setChieuRong(sc.nextInt());
                    
                    System.out.println("=>Sau khi sua: ");
                    xuat();
                    break;
                }
                System.out.println("Ma hinh khong ton tai!");
                break;
            } catch (Exception e) {
                System.out.println("Co loi " + e.toString());
            }
        }
    }
    
    static void timMaxDT() {
        System.out.println("Hinh CN co dien tich max la: ");
        System.out.println(Collections.max(myHCN, new CmpDienTich()));
    }

    public static void main(String[] args) {
        nhap();
        xuat();
        sua();
        timMaxDT();
    }
}
