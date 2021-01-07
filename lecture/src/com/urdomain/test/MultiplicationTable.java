package com.urdomain.test;

public class MultiplicationTable {
	public static void main(String[] args) {
		MultiplicationTable multiplication = new MultiplicationTable();
		
//		입력 정보
		int inputA = 8;
		int inputB = 2;
//		함수사용
		int D = 0;
		D = multiplication.checkInput(inputA, inputB);
		multiplication.syso(D, inputA, inputB);
	}
	
//	확인함수
	public int checkInput(int a, int b) {
		int[] inputNum = { a, b };
		int i = inputNum[0] ;
		int j = inputNum[1] ;
		
		int result = 0;
				if ( i>1 && i<=9 && j>1 && j<=9 ) {
					result = 1;
				} else {
					result = 0;
					}
				return result;
	}
	
//	구구단 출력함수
	public void syso(int result, int x, int y) {
		int[] multiple = { x, y };
		int x1 = multiple[0];
		int y1 = multiple[1];
		if ( result == 1 ) {
			System.out.println("--" + x1 + "단--");
			for ( int c=1; c<=9; c++) {
				System.out.println(x1 + " X " + c + " = " + (x1*c));
			}
			System.out.println("--" + y1 + "단--");
			for ( int d=1; d<=9; d++ ) {
				System.out.println(y1 + " X " + d + " = " + (y1*d));
			}
		} else if ( result == 0 ) {
			System.out.println("1에서 9사이의 숫자를 입력하세요!");
		} else {
//			pass
		}
	}
}
