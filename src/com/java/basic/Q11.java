package com.java.basic;

import java.util.Scanner;

public class Q11 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		long n;
		
		do {
			System.out.println("양의 정수를 입력하시오.");
			n = stdIn.nextLong();
		} while (n<=0);
			
		long x = 10;
		int i = 1;
		
		while (n>=x) {
			x*=10;
			i++;
		}
		
		System.out.println("그 수는 "+i+"자리입니다.");
	}

}
