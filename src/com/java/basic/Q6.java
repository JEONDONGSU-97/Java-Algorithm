package com.java.basic;

import java.util.Scanner;

public class Q6 {
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		int sum = 0;
		int i = 1;
	
		System.out.println("1부터 n까지의 합을 구합니다.");
		
		int n = stdIn.nextInt();
		
		while(i <= n) {
			sum += i;
			i++;
		}
		
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
		System.out.println("n의 값은 "+n+"입니다.");
		System.out.println("i의 값은 "+i+"입니다.");
	}

}
