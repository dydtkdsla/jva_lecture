package com.urdomain.test;

public class Lotto {
	public static void main(String[] args) {
//		로또배열 생성
		int[] lottoNums = new int[6];
		
//		i가 0~6까지 증가하면서 배열마다 난수 입력
		for (int i=0; i<6; i++) {
			lottoNums[i] = (int)(Math.random()*45 + 1);
//			if (i == 1) {
//				lottoNums[1] = 33;
//				
//			}

//			j가 i와 같으면 i번 배열 다시 돌아가서 난수 입력			
			for (int j=0; j<i; j++) {				
				if (lottoNums[i] == lottoNums[j]) {
					i--;
					} else {
//					pass
						}
				}
			}
		for (int lottoNum : lottoNums) {
			System.out.print(" [ " + lottoNum + " ] ");
		}
				
	}
}