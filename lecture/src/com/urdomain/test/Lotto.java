package com.urdomain.test;

public class Lotto {
	public static void main(String[] args) {
//		�ζǹ迭 ����
		int[] lottoNums = new int[6];
		
//		i�� 0~6���� �����ϸ鼭 �迭���� ���� �Է�
		for (int i=0; i<6; i++) {
			lottoNums[i] = (int)(Math.random()*45 + 1);
//			if (i == 1) {
//				lottoNums[1] = 33;
//				
//			}

//			j�� i�� ������ i�� �迭 �ٽ� ���ư��� ���� �Է�			
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