package HoaDon_KhachHang_SVThucHanh;
public class NgayThang {
    private int  thang; // 1-12 
    private int  ngay; // 1-31 based on month 
    private int  nam; // any year 

    public NgayThang(int thang, int ngay, int nam) {
        this.thang = thang;
        this.ngay = ngay;
        this.nam = nam;
    }
    
  @Override
    public String toString() {
        return  ngay+"/"+thang+"/"+nam;
    }   
  }
