package com.java.datastructure;

import java.util.Scanner;

public class Q10 {
	
	static final int VMAX = 21; // 시력 분포(0.0 ~ 2.0) 21개
	
	static class PhyscData {
		String name; 		// 이름
		int height;			// 키
		double vision;		// 시력
		
		// 생성자
		PhyscData(String name, int height, double vision) {
			this.name = name;
			this.height = height;
			this.vision = vision;
		}		
	}
	
	
	// 키의 평균값
	static double aveHeight(PhyscData[] dat) {
		
		double sum = 0;
		
		for(int i=0; i<dat.length; i++)
			sum += dat[i].height;
		
		return sum/dat.length;
	}
	
	// 시력 분포
	static void distVision(PhyscData[] dat, int[] dist) {
		
		int i = 0;
		
		dist[i] = 0;
		
		for(i=0; i<dat.length; i++)
			if(dat[i].vision >= 0.0 && dat[i].vision <= VMAX / 10.0)
				dist[(int) (dat[i].vision * 10)]++;
	}
	
	public static void main(String[] args) {
		Scanner stdIn = new Scanner(System.in);
		
		PhyscData[] x = {
			new PhyscData("길동", 181, 0.8),
			new PhyscData("맹구", 170, 0.88),
			new PhyscData("짱구", 168, 0.85),
			new PhyscData("철수", 175, 1.5),
			new PhyscData("영희", 162, 1.8),
		};
		
		int[] vdist = new int[VMAX]; // 시력 분포
		
		System.out.println("■ 신체검사 리스트 ■");
		System.out.println("이름           키     시력");
		System.out.println("---------------");
		
		for(int i=0; i<x.length; i++)
			System.out.printf("%-8s%3d%5.1f\n", x[i].name, x[i].height, x[i].vision);
		
		System.out.printf("\n평균 키 : %5.1fcm\n", aveHeight(x));
		
		distVision(x, vdist); // 시력 분포 구함
		
		System.out.println("\n시력 분포");
		for(int i=0; i<VMAX; i++) {
			System.out.printf("%3.1f ~: ", i / 10.0);
			for(int j=0; j<vdist[i]; j++)				
				System.out.print("*");
			System.out.println();
		}
			
					
	}

}
