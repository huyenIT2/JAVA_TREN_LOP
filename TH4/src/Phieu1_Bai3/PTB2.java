package Phieu1_Bai3;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class PTB2 {
    private float a, b, c;
    
    void nhap() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap cac he so a, b, c: ");
        a = sc.nextFloat();
        b = sc.nextFloat();
        c = sc.nextFloat();
        while (a == 0) {
            System.out.print("Nhap lai a: ");
            a = sc.nextFloat();
        }
    }
    
    private void giatPT() {
        float delta = b*b - 4*a*c;
        if (delta < 0) {
            System.out.println("Vo nghiem");
        }
        else if (delta == 0) 
            System.out.println("x1 = x2 = " + (-b/(2*a)));
        else
            System.out.println("x1 = " + ((-b+Math.sqrt(delta))/(2*a)) + ", x2 = " + ((-b-Math.sqrt(delta))/(2*a)));
    }
    
    public static void inTieuDe() {
        System.out.printf("%20s %30s%n", "PTB2", "Giai PT");
    }
    public void hienThiPTB2() {
        System.out.println(a + "x^2 + " + b + "x + " + c + " = 0");
    }
    public void xuat() {
        System.out.printf("%20s %30.1f%n");

    }

    

}
