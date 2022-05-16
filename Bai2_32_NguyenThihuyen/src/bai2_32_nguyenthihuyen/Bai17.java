/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_32_nguyenthihuyen;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Bai17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Nhập chuỗi: ");
        str = sc.nextLine();
        
        char[] charArray = str.toCharArray();
        boolean khoangTrang = true;
        for (int i=0; i<charArray.length; i++) {
            if (Character.isLetter(charArray[i])) {
                if (khoangTrang) {
                    charArray[i] = Character.toUpperCase(charArray[i]);
                    khoangTrang = false;
                }          
            }
            else {
                khoangTrang = true;
            }
        }
        
        str = String.valueOf(charArray);
        System.out.println("Chuỗi sau khi đổi: " + str);
    }
}
