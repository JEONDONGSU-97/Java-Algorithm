package com.java.basic;

import java.util.Scanner;

public class Q9 {

	static int sumof(int a, int b) {
		
		int sum = 0;
		
		if(a>b) sum = (a+b)*(a-b+1)/2;
		else sum = (a+b)*(b-a+1)/2;
		
		return sum;
	}
	
	public static void main(String[] args) {
		
		Scanner stdIn = new Scanner(System.in);
		System.out.print("a : ");
		int a = stdIn.nextInt();
		System.out.print("b : ");
		int b = stdIn.nextInt();
		int sum = sumof(a, b);
		
		if(a>b) System.out.println(b+"와"+a+"사이의 합은 "+sum+"입니다.");
		else System.out.println(a+"와"+b+"사이의 합은 "+sum+"입니다.");
	}

}
