package com.java.codeup;

import java.util.*;

public class P_1096 {

//	기숙사 생활을 하는 학교에서 어떤 금요일(전원 귀가일)에는 모두 집으로 귀가를 한다.
//
//	오랜만에 집에 간 영일이는 아버지와 함께 두던 매우 큰 오목에 대해서 생각해 보다가
//	"바둑판에 돌을 올린 것을 프로그래밍 할 수 있을까?"하고 생각하였다.
//
//	바둑판(19 * 19)에 n개의 흰 돌을 놓는다고 할 때,
//	n개의 흰 돌이 놓인 위치를 출력하는 프로그램을 작성해보자.
//
//
//	참고
//	가로번호, 세로번호를 사용할 수 있는 2차원 배열을 사용하면
//	이러한 형태를 쉽게 기록하고 사용할 수 있다. 물론 더 확장한 n차원 배열도 만들 수 있다.
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int [][]arr = new int[20][20];
		
		System.out.print("바둑돌의 개수 : ");
		int n = sc.nextInt();
		
		for(int i=1; i<=n; i++) {
			
			System.out.print(i+"번째 x,y축 : ");
			int x = sc.nextInt();
			int y = sc.nextInt();
			arr[x][y] = 1;
		}
				
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				if(arr[i][j] != 1) {
					System.out.print("0"+" ");
				} else {
					System.out.print("1"+" ");
				}
			}
			System.out.println();
		}
	}
}
