package Phieu6;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NgayThang {
    private int thang;
    private int ngay;
    private int nam;
    
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap ngay, thang, nam: ");
        ngay = sc.nextInt();
        thang = sc.nextInt();
        nam = sc.nextInt();
    }
    
    @Override
    public String toString() {
        return ngay + "/" + thang + "/" + nam;
    }
}
