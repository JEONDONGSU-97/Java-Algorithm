package com.java.codeup;

import java.util.Scanner;

public class P_1094 {
	
//	정보 선생님은 수업을 시작하기 전에 이상한 출석을 부른다.
//
//	학생들의 얼굴과 이름을 빨리 익히기 위해 번호를 무작위(랜덤)으로 부르는데,
//	영일이는 선생님이 부른 번호들을 기억하고 있다가 거꾸로 불러보는 것을 해보고 싶어졌다.
//
//	출석 번호를 n번 무작위로 불렀을 때, 부른 번호를 거꾸로 출력해 보자.
//
//
//	참고
//	배열에 순서대로 기록해 두고, 기록된 내용을 거꾸로 출력하면 된다.
	
//	입력 예시
//	10
//	10 4 2 3 6 6 7 9 8 5
	
//	출력 예시
//	5 8 9 7 6 6 3 2 4 10
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("번호 갯수 : ");
		int n = sc.nextInt();
		int arr[] = new int[n+1];
		
		System.out.print("번호 "+n+"개를 공백으로 표기 : ");
		for(int i=0; i<n; i++) {
			int a = sc.nextInt();
			arr[i+1] = a;
		}
		
		for(int i=n; i>0; i--) {
			System.out.print(arr[i]+" ");
		}
			
	}

}
