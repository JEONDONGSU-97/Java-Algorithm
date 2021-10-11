package com.java.datastructure;

import java.util.Scanner;

public class Q5 {

	static void rcopy(int[] a, int[] b) {
		int num = a.length>=b.length ? b.length	: a.length;
		int j = num-1;
		for(int i=0; i<num; i++) {
			a[i] = b[j--];
		}
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		System.out.print("a의 요솟수 : ");
		int na = stdIn.nextInt();
		int[] a = new int[na];
		for(int i=0; i<na; i++) {
			System.out.print("a["+i+"] : ");
			a[i] = stdIn.nextInt();
		}
		
		System.out.print("b의 요솟수 : ");
		int nb = stdIn.nextInt();
		int[] b = new int[nb];
		for(int i=0; i<nb; i++) {
			System.out.print("b["+i+"] : ");
			b[i] = stdIn.nextInt();
		}
		
		rcopy(a, b);
		
		System.out.println("역순배열 복사 완료");
		for(int i=0; i<a.length; i++) {
			System.out.print("\na["+i+"] = "+a[i]);
		}
		
	}

}
