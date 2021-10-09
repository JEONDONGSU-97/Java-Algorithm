package com.java.basic;

import java.util.Random;
import java.util.Scanner;

public class Q5 {
	static int med3(int a, int b, int c) {
		if (a >= b)
			if (b >= c)
				return b;
			else if (a <= c)
				return a;
			else
				return c;
		else if (a > c)
			return a;
		else if (b > c)
			return c;
		else
			return b;
	}

	static int med3_2 (int a, int b, int c) {
		if ((b >= a && c <= a) || (b <= a && c >= a))
			return a;
		else if ((a > b && c < b) || (a < b && c > b))
			return b;
		return c;
	}

	public static void main(String[] args) {
		Random generator = new Random();  
		System.out.println("세 정수의 중앙값을 구합니다.");

		long start = System.currentTimeMillis();
		for(int i=0; i<10000; i++) {
			int a = generator.nextInt();
			int b = generator.nextInt();
			int c = generator.nextInt();

			System.out.println("======= " + i + "회차 ========");
			System.out.println("a의 값 -> " + a);
			System.out.println("b의 값 -> " + b);
			System.out.println("c의 값 -> " + c);
			System.out.println("중앙값은 " + med3(a, b, c) + "입니다.");
			System.out.println("");
		}
		long end = System.currentTimeMillis();
		System.out.println("연산 시간은 " + (end-start) + "ms입니다.");
	}
}

