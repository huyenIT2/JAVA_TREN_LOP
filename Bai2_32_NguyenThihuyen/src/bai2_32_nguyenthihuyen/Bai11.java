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
public class Bai11 {
     public static void main(String[] args) {
        int m,n; //Số dòng, số cột
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhập số dòng: ");
        m = sc.nextInt();
        System.out.print("Nhập số cột: ");
        n = sc.nextInt();
        
        int A[][] = new int[m][n];
        System.out.println("Nhập các phần tử: ");
        for (int i=0; i<m; i++) {
            for (int j=0; j<n; j++) {
                System.out.print("A[" + i + "][" + j + "] = ");
                A[i][j] = sc.nextInt();
            }
        }
        
        int max = soNTmax(A,m,n);     
        System.out.println("Số nguyên tố lớn nhất của mảng 2 chiều vừa nhập là: " + max);
    }
    public static boolean soNguyenTo(int n) {
	for (int i=2; i<n; i++) {
            if (n%i==0) return false;
	}
	return n>=2;
    } 
    public static int soNTmax(int A[][], int m, int n) {     
       int max = 0;
       for (int i=0; i<m; i++) {
           for (int j=0; j<n; j++) {
               if (soNguyenTo(A[i][j])) {
                   if (A[i][j] > max) {
                       max = A[i][j];
                   }
               }
           }
       }
       return max;
    }
}
