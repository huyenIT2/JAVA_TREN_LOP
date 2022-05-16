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

    public static boolean checkMaHinh(HinhCN hcn) {
        return myHCN.contains(hcn);
    }

    static void nhap() {
        int soHCN;
        do {
            System.out.print("Nhap so hinh chu nhat: ");
            soHCN = sc.nextInt();
            if (soHCN > 5) {
                System.out.println("So HCN > 5, moi ban nhap lai!");
            }
        } while (soHCN > 5);
        sc.nextLine();
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
                    System.out.println("Ma hinh trung, moi nhap lai!");
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
                System.out.print("Nhap ma hinh can sua: ");
                HinhCN hcn = new HinhCN();
                hcn.setMaHinh(sc.nextLine());

                int pos = myHCN.indexOf(hcn);
                if (pos != -1) {
                    System.out.print("Nhap chieu dai sua: ");
                    myHCN.get(pos).setChieuDai(sc.nextInt());
                    System.out.print("Nhap chieu rong sua: ");
                    myHCN.get(pos).setChieuRong(sc.nextInt());
                    System.out.println("\t=>DANH SACH HINH CHU NHAT SAU KHI SUA");
                    xuat();
                    break;
                }
                System.out.println("\t=> Ma hinh khong ton tai");
                break;
            } catch (Exception e) {
                System.out.println("Co loi" + e.toString());
            }
        }      
    }

    static void timMax() {
        System.out.println("*Hinh CN co dien tich max:");
        System.out.println(Collections.max(myHCN, new HinhCNCmpDienTich()));
    }

    public static void main(String[] args) {
        nhap();
        System.out.println("\t\t=====DANH SACH HINH CHU NHAT========");
        xuat();
        sua();
        timMax();
    }
}
