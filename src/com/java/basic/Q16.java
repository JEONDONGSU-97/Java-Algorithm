package com.java.basic;

import java.util.Scanner;

public class Q16 {

	static void spira(int n) {
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--)
				System.out.print(" ");
			for(int j=1; j<=(i-1)*2+1; j++)
				System.out.print("*");
			System.out.println();
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("피라미드 모양으로 나타납니다.");
		int n;
		
		do {
			System.out.print("단수는 : ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		spira(n);

	}

}
