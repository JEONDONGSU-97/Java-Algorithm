package com.java.codeup;

import java.util.*;

public class P_1097 {

//	부모님을 기다리던 영일이는 검정/흰 색 바둑알을 바둑판에 꽉 채워 깔아 놓고 놀다가...
//
//	"십(+)자 뒤집기를 해볼까?"하고 생각했다.
//
//	바둑판(19 * 19)에 흰 돌(1) 또는 검정 돌(0)이 모두 꽉 채워져 놓여있을 때,
//	n개의 좌표를 입력받아 십(+)자 뒤집기한 결과를 출력하는 프로그램을 작성해보자.
//
//	참고
//	가로 번호, 세로 번호를 사용할 수 있는 2차원 배열을 사용하면
//	이러한 형태를 쉽게 기록하고 사용할 수 있다. 물론 더 확장한 n차원 배열도 만들 수 있다.
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int arr[][] = new int[20][20];
		
		for(int i=1; i<=19; i++) {			
			for(int j=1; j<=19; j++) {
				int a = sc.nextInt();
				arr[i][j] = a;
			}
		}
		
		int n = sc.nextInt();
		for(int a=0; a<n; a++) {
			int x = sc.nextInt();
			int y = sc.nextInt();
			for(int i=1; i<=19; i++) {				
				if(arr[x][i] == 0) {	// 0일때 1로 뒤집기 
					arr[x][i] = 1;
				} else if(arr[x][i] == 1) {	    // 1일때 0으로 뒤집기
					arr[x][i] = 0;
				}
			}
			for(int j=1; j<=19; j++) {
				if(arr[j][y] == 0) {	// 0일때 1로 뒤집기
					arr[j][y] = 1;
				} else if(arr[j][y] == 1) {		// 1일때 0으로 뒤집기
					arr[j][y] = 0;
				}
			}
		}
		
		for(int i=1; i<=19; i++) {
			for(int j=1; j<=19; j++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		
	}
}
