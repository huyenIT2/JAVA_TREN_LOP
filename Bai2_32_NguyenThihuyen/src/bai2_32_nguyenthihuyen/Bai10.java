/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2_32_nguyenthihuyen;

/**
 *
 * @author Huyen
 */
public class Bai10 {
    public static void main(String[] args) {
	int []A= {1,2,3,4,5,6,7,8,9,10};
	int n=10;
	for (int i=0; i<n-1; i++) {
            for (int j=i+1; j<n; j++) {
		if (A[i]>A[j]) {
                    int temp= A[i];
			A[i]= A[j];
			A[j]= temp;
		}
            }
        }
		
        for (int i=0; i<n-1; i++) {
            if (!soNguyenTo(A[i])) {
                for (int j=i+1; j<n; j++) {
                    if (soNguyenTo(A[j])) {
                        int temp= A[i];
                            A[i]= A[j];
                            A[j]= temp;
                            break;
                    }
                }
            }
        }
        System.out.println("Mảng sau khi sắp xếp: ");
        for (int i=0; i<n; i++) {
            System.out.print(A[i]+" ");
        }
		
    }
    public static boolean soNguyenTo(int n) {
	for (int i=2; i<n; i++) {
            if (n%i==0) return false;
	}
	return n>=2;
    } 
}
