/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package phieu4_bai2_32_nguyenthihuyen;

/**
 *
 * @author Huyen
 */
public class NgayThang {
    int  thang; // 1-12 
    int  ngay; // 1-31 based on month 
    int  nam; // any year 

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
