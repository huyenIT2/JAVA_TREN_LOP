package De3;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class TamGiacCan implements HinhPhang {
    private String maHinh;
    private float a, b, c;

    public String getMaHinh() {
        return maHinh;
    }

    public void setMaHinh(String maHinh) {
        this.maHinh = maHinh;
    }
  
    private boolean kiemTraTGC(float m, float n, float p) {
        if (m + n > p && n + p > m && m + p > n)
            if (m == n || n == p || p == m)
                return true;
        return false;
    }
   
    @Override
    public float tinhCV() {
        return a + b + c;
    }

    @Override
    public float tinhDT() {
        float p = tinhCV()/2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }

    @Override
    public void input() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ma hinh: ");
        maHinh = sc.nextLine();
        
        boolean check;
        do {
            System.out.print("Nhap canh a: ");
            a = sc.nextFloat();
            System.out.print("Nhap canh b: ");
            b = sc.nextFloat();
            System.out.print("Nhap canh c: ");
            c = sc.nextFloat();
            
            check = kiemTraTGC(a, b, c);
            if (!check)
                System.out.println("Moi ban nhap lai");
        } while (!check);
    }

    public static void inTieuDe() {
        System.out.printf("%-12s %12s %12s %12s %12s %12s%n", "Ma hinh", "Canh 1", "Canh 2", "Canh 3", "Chu vi", "Dien tich");
    }
    @Override
    public void output() {
        System.out.printf("%-12s %12.2f %12.2f %12.2f %12.2f %12.2f%n", maHinh, a, b, c, tinhCV(), tinhDT());
    }
    
}
