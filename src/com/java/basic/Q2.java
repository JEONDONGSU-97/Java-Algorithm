package com.java.basic;

import java.util.Scanner;

public class Q2 {

	static int min3(int a, int b, int c) {
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		return min;
	}
	
	public static void main(String[] args) {
		
		int a, b, c;
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력해주세요.");
		
		System.out.print("a : "); a = sc.nextInt();
		System.out.print("b : "); b = sc.nextInt();
		System.out.print("c : "); c = sc.nextInt();
		
		int min = min3(a, b, c);
		
		System.out.print("최솟값은 "+min+"입니다.");
	}

}

