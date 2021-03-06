package com.ssafy.divide;

import java.util.Scanner;

public class DCTest {
	static int N;
	static int[][] map;
	static int w,g;
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		N = sc.nextInt();
		map = new int[N][N];
		for(int i=0; i<N; i++) {
			for(int j=0; j<N; j++) {
				map[i][j] = sc.nextInt();
			} 
		}
		
		dfs(0,0,N);
		System.out.println(w+" "+g);
	}

//	매개변수 생각 // 바뀌는 값  // y : i // x : j
	static void dfs(int y,int x,int size) {
//		종료 => 전체가 하나의 색으로 칠해져 있으면 종료.
		int sum=0;
		for(int i=y; i<y+size; i++) {
			for(int j=x; j<x+size;j++) {
				sum+=map[i][j];
			}
		}
		
		if(sum ==0) { //모두 하얀색일떄
			w++;
			return;
		}
		if(sum == size*size) { //모두 초록색일떄
			g++;
			return;
		}
		
		
//		실행 & 재귀 => 전체가 하나의 색이 아니면 4분할 재귀 호출
		
		int nSize = size/2;
		 dfs(y,x,nSize); //왼쪽 상단
	        dfs(y,x + nSize, nSize); //오른쪽 상단
	        dfs(y+nSize, x, nSize); //왼쪽 하단
	        dfs(y+nSize, x+nSize, nSize); //오른쪽 하단

	
		
		
		
		
		
		
	}
}
