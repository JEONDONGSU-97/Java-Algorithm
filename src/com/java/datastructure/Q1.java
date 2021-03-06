package com.java.datastructure;

import java.util.Random;

public class Q1 {

	static int maxOf(int[] a) {
		int max = a[0];
		for(int i=1; i<a.length; i++)
			if(a[i] > max)
				max = a[i];
		return max;
	}
	
	public static void main(String[] args) {
		Random rand = new Random();
		
		System.out.println("키의 최댓값을 구합니다.");		
		int num = rand.nextInt(20)+1;
		System.out.print("사람 수 : ");
		System.out.println(num);
		int[] height = new int[num];
		
		for(int i=0; i<num; i++) {
			height[i] = 100 + rand.nextInt(90);
			System.out.println("height["+i+"] : "+height[i]);
		}
		
		System.out.println("최댓값은 "+maxOf(height)+"입니다.");
	}

}
