package com.java.searching;

import java.util.Scanner;

public class Q3 {

	static int searchIdx(int[] a, int n, int key, int[] idx) {
		
		int count = 0;
		
		for(int i=0; i<n; i++) {
			if(a[i] == key) {
				idx[count++] = i;				
			}			
		}
		return count;	
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟값 : ");
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		int[] y = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		

		
		
		int idx = searchIdx(x, num, ky, y);
		if(idx == 0)
			System.out.println("해당 값을 찾지 못했습니다.");
		else
			System.out.println(ky+"은(는)"+idx+"개 존재합니다.");
		
	}

}
