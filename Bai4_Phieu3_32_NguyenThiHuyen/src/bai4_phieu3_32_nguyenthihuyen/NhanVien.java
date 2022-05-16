package bai4_phieu3_32_nguyenthihuyen;
import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class NhanVien {
    private String maNV;
    private int soSP;
    final int CHUAN = 500;
    final int GIA1 = 20000;
    final int GIA2 = 30000;

    public NhanVien() {
        this.maNV = "";
        this.soSP = 0;
    }
    
    public NhanVien(String maNV, int soSP) {
        this.maNV = maNV;
        this.soSP = soSP;
    }

    public String getMaNV() {
        return maNV;
    }

    public void setMaNV(String maNV) throws Exception {
        if (maNV == null || maNV.compareTo("") == 0)  throw new Exception("Ma NV khong duoc de trong");
        this.maNV = maNV;
    }

    public int getSoSP() {
        return soSP;
    }

    public void setSoSP(int soSP) throws Exception {
        if (soSP <= 0) throw new Exception("so SP > 0");
        this.soSP = soSP;
    }
    
    public boolean coVuotChuan() {
        if (soSP > CHUAN) 
            return true;
        return false;
    }
    
    public String getTongKet() {
        if (coVuotChuan())
            return "Vuot";
        else
            return "";
    }
    
    public double getLuong() {
        if (!coVuotChuan()) 
            return soSP * GIA1;
        else
            return CHUAN * GIA1 + (soSP-CHUAN)*GIA2;
    }
    
    void nhap() {
        Scanner sc = new Scanner(System.in);
        while(true) {
            try {
                System.out.print("Nhap ma NV: ");
                setMaNV(sc.nextLine());
                break;
            } catch (Exception e) {
                System.out.println("Co loi " + e.toString());
            }  
        }   
        while(true) {
            try {
                System.out.print("Nhap so SP: ");
                setSoSP(sc.nextInt());
                break;
            } catch (Exception e) {
                System.out.println("Co loi " + e.toString());
            }  
        }
    }
    
    static void xuatTieuDe() {
        System.out.printf("%-15s %15s %30s %15s%n", "Ma NV", "So SP", "Luong", "Tong ket");
    }
    
    void inDL() {
        System.out.printf("%-15s %15d %30.2f %15s%n", maNV, soSP, getLuong(), getTongKet());
    }
    
}
