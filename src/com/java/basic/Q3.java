package com.java.basic;


public class Q3 {

	public static void main(String[] args) {
		
		System.out.println("min4(6, 6, 5, 4) : " + min4(6, 6, 5, 4));
		System.out.println("min4(6, 4, 7, 8) : " + min4(6, 4, 7, 8));
		
	}
	
	static int min4(int a, int b, int c, int d) {
		
		int min = a;
		if(b<min) min = b;
		if(c<min) min = c;
		if(d<min) min = d;
		
		return min;
		
	}

}

