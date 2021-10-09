package com.java.basic;

import java.util.Scanner;

public class Q7 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n의 값을 입력하시오.");
		
		int n = stdIn.nextInt();
		int sum = 0;
		
		for(int i=1; i<=n; i++) {
			sum += i;
			if(i<n) System.out.print(i+" + ");
			else System.out.print(i+" = "+sum);
		}
		
	}

}
