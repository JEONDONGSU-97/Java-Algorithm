package com.java.basic;

public class Q13 {

	public static void main(String[] args) {

		for(int i=0; i<=9; i++) {
			if(i==0) {
				System.out.print(" "+" |"); 
			}
			else System.out.print(" "+i+"|");
			
			for(int j=1; j<=9; j++) {
				if(i==0) {
					System.out.printf("%3d", j);
				}
				else System.out.printf("%3d", i+j);				
			}
			if(i==0) {
				System.out.println();
				System.out.print("--+---------------------------");
				System.out.println();
			}
			else System.out.println();
		}

	}

}
