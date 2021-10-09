package com.java.basic;

import java.util.Scanner;

public class Q8 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.println("n값을 입력하시오.");
		int n = stdIn.nextInt();
		int sum = (n+1)*n/2;  // 가우스 덧셈
		System.out.println("1부터 "+n+"까지의 합은 "+sum+"입니다.");
	}

}
