package com.java.basic;

import java.util.Scanner;

public class Q1 {
	
	static int max4(int a, int b, int c, int d) {
		int max = a;
		if(b>max) {max = b;}
		if(c>max) {max = c;}
		if(d>max) {max = d;}		
		return max;
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫 번째 숫자를 입력하시오 : ");
		int a = sc.nextInt();
		
		System.out.print("두 번째 숫자를 입력하시오 : ");
		int b = sc.nextInt();
		
		System.out.print("세 번째 숫자를 입력하시오 : ");
		int c = sc.nextInt();
		
		System.out.print("네 번째 숫자를 입력하시오 : ");
		int d = sc.nextInt();
		
		System.out.println("최대값 : " + max4(a, b, c, d)); 
	}

}

