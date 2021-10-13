package com.java.searching;

import java.util.Scanner;

public class Q2 {

	static int seqSearchSen(int[] a, int num, int key) {
		
		System.out.print("   |");
		
		for(int k=0; k<num; k++) {
			System.out.printf("%4d", k);
		}
		System.out.println();
		
		System.out.print("---+");
		for (int k=0; k<4*num+2; k++)
			System.out.print("-");
		System.out.println();
		
		for(int i=0; i<num; i++) {
			System.out.print("   |");
			System.out.printf(String.format("%%%ds*\n", (i*4)+3), "");
			System.out.printf("%3d|",i);
			for(int k=0; k<num; k++) {
				System.out.printf("%4d", a[k]);
			}
			System.out.println("\n   |");
			if(a[i] == key) {
				return i;
			}
		}
		return 1;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		System.out.print("요솟값 : ");
		
		int num = stdIn.nextInt();
		int[] x = new int[num];
		
		for(int i=0; i<num; i++) {
			System.out.print("x["+i+"] : ");
			x[i] = stdIn.nextInt();
		}
		
		System.out.print("검색할 값 : ");
		int ky = stdIn.nextInt();
		
		int idx = seqSearchSen(x, num, ky);
		
		if(idx == -1)
			System.out.println("그 값의 요소가 없습니다.");
		else
			System.out.println(ky+"은 "+"x[" + idx + "]에 있습니다.");	
	}

}
