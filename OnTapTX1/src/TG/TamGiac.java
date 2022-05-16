package TG;

import java.util.Random;

/**
 *
 * @author Huyen
 */
public class TamGiac implements HinhPhang {
    private int a, b, c;
    
    @Override
    public int tinhCV() {
        return a + b + c;
    }

    @Override
    public float tinhDT() {
        float p = tinhCV()/2;
        return (float)Math.sqrt(p*(p-a)*(p-b)*(p-c));
    }
    
    private boolean kiemTraTG(float m, float n, float p) {
        return m + n > p && n + p > m && m + p > n;
    }
    
    public void nhap() {  
        Random rd = new Random();
        boolean check;
        do {
            //Random độ dài 3 cạnh của tam giác
            a = rd.nextInt(100)+1;
            b = rd.nextInt(100)+1;
            c = rd.nextInt(100)+1;
            
            check = kiemTraTG(a, b, c);
            if (!check)
                System.out.println("Khong phai tam giac, random lai");
        } while (!check);
    }
    
    public static void inTieuDe() {
        System.out.printf("%12s %12s %12s %12s %12s%n", "Canh 1", "Canh 2", "Canh 3", "Chu vi", "Dien tich");
    }
    
    public void xuat() {
        System.out.printf("%12d %12d %12d %12d %12.2f%n", a, b, c, tinhCV(), tinhDT());
    }
}
