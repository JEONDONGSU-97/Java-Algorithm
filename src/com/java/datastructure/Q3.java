package com.java.datastructure;

import java.util.Scanner;

public class Q3 {
		
	static int sumOf(int[] a) {
		Scanner stdIn = new Scanner(System.in);
		int sum = 0;
		for(int i=0; i<a.length; i++) {
			a[i] = stdIn.nextInt();
			System.out.println("a["+i+"] : "+a[i]);
			sum += a[i];
		}
		return sum;
	}
	
	public static void main(String[] args) {
		
		System.out.print("요솟수 : ");
		Scanner stdIn = new Scanner(System.in);
		int num = stdIn.nextInt();
		
		int[] x = new int[num];
		
		System.out.println("합 : "+sumOf(x));

	}

}
