package Phieu1_Bai4;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class XeDemo {
    static Xe dsXe[];
    static int n; //Số lượng xe
    
    static void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luong xe: ");
        n = sc.nextInt();
        dsXe = new Xe[n]; //Cấp phát mảng
        for (int i=0; i<n; i++) {
            dsXe[i] = new Xe(); //cấp phát cho phần tử mảng thứ i
            System.out.println("Nhap thong tin xe thu " + (i+1) + ": ");
            dsXe[i].nhap();
        }
    }
    
    static void inDSXe() {
        Xe.inTieuDe();
        for (Xe x : dsXe)
            x.inDL();
    }
    
    public static void main(String[] args) {
        int chon=0;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println("1. Nhap thong tin xe");
            System.out.println("2. Xuat bang ke khai tien thue");
            System.out.println("3. Thoat");
            System.out.println("Moi ban chon");
            chon = sc.nextInt();
            switch (chon) {
                case 1: 
                    nhap();
                    break;
                case 2:
                    inDSXe();
                    break;
                case 3: 
                    System.exit(0);
            }
        } while (chon != 3);
    }
}
