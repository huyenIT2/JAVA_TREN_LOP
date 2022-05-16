package Mang1chieu;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
import java.util.Scanner;
class SapXepMang{
    static Integer[] day;
    static int n; //=day.length;
        static void nhap(){	
            Random rd=new Random();
            for (int k=0; k<n; k++)
                day[k]=rd.nextInt(20);
    }
    static void hienThi(){	
        for(int k=0; k<n;k++)
            System.out.print (day[k]+" ");
    }
    // sap xep day
    static void sapXep(){
        Arrays.sort(day); //Sắp tăng dần
        //Sắp giảm dần
//        Arrays.sort(day, Collections.reverseOrder());

//        int tg;
//        for( int i=0;i<day.length;i++)
//            for( int j=i+1;j<day.length;j++)
//                if (day[i]>day[j]){ 
//                    tg=day[i];
//                    day[i]=day[j];
//                    day[j]=tg;
//                }
    }
//ham chinh
public static void main (String[] args) {
    //khai báo số phần tử dãy và nhập số phần tử
    day = new Integer[10];
//    System.out.print (" Nhap vao so phan tu cua day");
    //xin cấp phát dãy số
    n = day.length;
    //nhập dãy số và in dãy trước khi nhập
    nhap();
    System.out.println ("Day truuoc khi sap xep");
    hienThi();
    //sắp xếp dãy số và in lại
    sapXep();
    System.out.println ("Day sau khi sap xep");
    hienThi();
    }
}