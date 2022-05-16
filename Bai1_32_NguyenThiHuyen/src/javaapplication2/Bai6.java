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
public class Bai6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        System.out.printf("Nhap n: ");
        n = sc.nextInt();
        if (SNT(n))
            System.out.println(n + " la SNT");
        else
            System.out.println(n + " khong phai SNT");
    }
    public static boolean SNT(int n){
        if (n < 2)
            return false;
        else 
            for (int i=2; i<n; i++)
                if (n%i == 0)
                    return false;
        return true;
    }
}

