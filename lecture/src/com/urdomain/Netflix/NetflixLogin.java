package com.urdomain.Netflix;
import java.util.Scanner;

public class NetflixLogin {
	public static void main(String[] args) {
		
//		-------------------------- ���� --------------------------
		NetflixLogin netflix = new NetflixLogin();
		Scanner scanner = new Scanner(System.in);
		// ���� �Է�
		System.out.println(Netflix.brand);
		System.out.println("");
		System.out.println("");
		System.out.println("  ����������������������������");
		System.out.print("      ID : ");
		String getId = scanner.nextLine();
		System.out.println("  ����������������������������");
		System.out.println("  ����������������������������");
		System.out.print("      PW : ");
		String getPw = scanner.nextLine();
		System.out.println("  ����������������������������");
		System.out.println("");
		System.out.println("=====================");
		
		//	��й�ȣ char �迭ȭ / �迭���� ����
		char[] pwCharArray = getPw.toCharArray();
		int blindPwNum = pwCharArray.length;				
		//	�Էµ� ���� �Ǵ��Լ��� ����
		int a = netflix.resultCheck(getId, getPw);
		//	�Էµ� ���� ���̵� ��� 
		netflix.printInput(getId);
		//	�Էµ� ��й�ȣ �迭���̸�ŭ *�� ġȯ�ؼ� ���
		System.out.print(" / PW : ");
		for(int i=0; i<blindPwNum; i++) {
			System.out.print("*");
		}
		System.out.println(" ]");
		//	�Ǵ��Լ� ����� ���� ��� ���
		netflix.printResult(a);
	}
//	---------------------------------------------------------------
	
	
//	------------------------- �Ǵ� �Լ� -------------------------
	public int resultCheck(String id, String pw) {
	// db : �Է� �Ǵ�
		int result = 0;
				if ( id.equals(Netflix.user[1]) && pw.equals(Netflix.user[2]) ) {
					result = 1;
				} else { 
					result = 0;			
			}
			return result;
	}
// ----------------------------------------------------------------
	
	
// --------------------- �Է����� ��� �Լ�--------------------
	public void printInput(String getId) {
		System.out.print("    [ ID : " + getId);
	}
//-----------------------------------------------------------------
	

// ----------------------- ��� ��� �Լ� ----------------------
	public void printResult(int result) {

		if (result == 1 ) {
			System.out.println("      " + Netflix.user[0] + "�� ȯ���մϴ�!");			
		} else if (
			result == 0 ) {
			System.out.println("  ���̵� Ȥ�� ��й�ȣ�� Ȯ�� ���ּ���!");
		} else {
//			pass
		}
	}
// --------------------------------------------------------------
}