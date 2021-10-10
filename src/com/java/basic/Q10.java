package com.java.basic;

import java.util.Scanner;

public class Q10 {

	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 값: ");
		int a = stdIn.nextInt();
		
		System.out.print("b의 값: ");
		int	b = stdIn.nextInt();

		while(b<=a) {
			
			System.out.println("a보다 큰 값을 입력하시오.");
			System.out.print("b의 값: ");
			b = stdIn.nextInt();
				
		}
		
		System.out.println("b - a는 "+(b-a)+"입니다.");
		
	}

}
