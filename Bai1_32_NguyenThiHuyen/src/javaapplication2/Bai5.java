/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication2;

import java.util.Scanner;

/**
 *
 * @author Huyen
 */
public class Bai5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;
        System.out.println("Nhap 2 so a va b: ");
        a = sc.nextInt();
        b = sc.nextInt();
        while(a != b){  
            if(a > b)  
                a = a - b;   
            else    
                b = b - a;   
        }
        System.out.println("UCLN = " + a);              
    }   
}
