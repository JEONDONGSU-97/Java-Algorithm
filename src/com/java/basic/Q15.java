package com.java.basic;

import java.util.Scanner;

public class Q15 {
	
	// 왼쪽 아래가 직각인 이등변 삼각형
	static void triangleLB(int n) {

		for(int i=1; i<=n; i++) {
			for(int j=1; j<=i; j++) 
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	// 왼쪽 위가 직각인 이등변 삼각형
	static void triangleLU(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) 
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	// 오른쪽 위가 직각인 이등변 삼각형
	static void triangleRU(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=n; j>=i; j--) 
				System.out.print("*");
			System.out.println();
			for(int j=1; j<=i; j++) 
				System.out.print(" ");			
		}
		
	}
	
	// 오른쪽 아래가 직각인 이등변 삼각형
	static void triangleRB(int n) {
		
		for(int i=1; i<=n; i++) {
			for(int j=i; j<=n-1; j++)
				System.out.print(" ");
			for(int j=1; j<=i; j++)
				System.out.print("*");
			System.out.println();
		}
		
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		int n;
		System.out.println("삼각형 모양을 나타냅니다.");
		
		do {
			System.out.print("단수 : ");
			n = stdIn.nextInt();
		} while(n<=0);
		
		System.out.println("왼쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		triangleLB(n);
		
		System.out.println("왼쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		triangleLU(n);
		
		System.out.println("오른쪽 아래가 직각인 이등변 삼각형을 출력합니다.");
		triangleRB(n);
		
		System.out.println("오른쪽 위가 직각인 이등변 삼각형을 출력합니다.");
		triangleRU(n);
		
	}
	
	

}
