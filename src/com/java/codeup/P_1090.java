package com.java.codeup;

import java.util.Scanner;

public class P_1090 {

//	어떤 규칙에 따라 수를 순서대로 나열한 것을 수열이라고 한다.
//
//	예를 들어
//	2 6 18 54 162 486 ... 은
//	2부터 시작해 이전에 만든 수에 3을 곱해 다음 수를 만든 수열이다.
//
//	이러한 것을 수학에서는 앞뒤 수들의 비율이 같다고 하여
//	등비(비율이 같다의 한문 말) 수열이라고 한다.
//
//
//	등비 수열을 알게된 영일이는 갑자기 궁금해졌다.
//
//	"그럼.... 13번째 나오는 수는 뭘까?"
//
//	영일이는 프로그램을 만들어 더 큰 수도 자동으로 계산하고 싶어졌다.
//
//
//	시작 값(a), 등비(r), 몇 번째인지를 나타내는 정수(n)가 입력될 때
//	n번째 수를 출력하는 프로그램을 만들어보자.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a;
		int r;
		int n;
		
		System.out.print("시작 값 : ");
		a = sc.nextInt();
		
		System.out.print("등비의 값 : ");
		r = sc.nextInt();
		
		System.out.print("몇번째 : ");
		n = sc.nextInt();
		
		if(r==0) {
			System.out.println(r);		
		} else if(r!=0) {
			System.out.printf("%.0f", a*Math.pow(r,n-1));
		}
		
	}

}
