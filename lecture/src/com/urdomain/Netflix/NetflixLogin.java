package com.urdomain.Netflix;
import java.util.Scanner;

public class NetflixLogin {
	public static void main(String[] args) {
		
//		-------------------------- 메인 --------------------------
		NetflixLogin netflix = new NetflixLogin();
		Scanner scanner = new Scanner(System.in);
		// 정보 입력
		System.out.println(Netflix.brand);
		System.out.println("");
		System.out.println("");
		System.out.println("  ┌────────────┐");
		System.out.print("      ID : ");
		String getId = scanner.nextLine();
		System.out.println("  └────────────┘");
		System.out.println("  ┌────────────┐");
		System.out.print("      PW : ");
		String getPw = scanner.nextLine();
		System.out.println("  └────────────┘");
		System.out.println("");
		System.out.println("=====================");
		
		//	비밀번호 char 배열화 / 배열길이 추출
		char[] pwCharArray = getPw.toCharArray();
		int blindPwNum = pwCharArray.length;				
		//	입력된 정보 판단함수에 대입
		int a = netflix.resultCheck(getId, getPw);
		//	입력된 정보 아이디 출력 
		netflix.printInput(getId);
		//	입력된 비밀번호 배열길이만큼 *로 치환해서 출력
		System.out.print(" / PW : ");
		for(int i=0; i<blindPwNum; i++) {
			System.out.print("*");
		}
		System.out.println(" ]");
		//	판단함수 결과에 따른 결과 출력
		netflix.printResult(a);
	}
//	---------------------------------------------------------------
	
	
//	------------------------- 판단 함수 -------------------------
	public int resultCheck(String id, String pw) {
	// db : 입력 판단
		int result = 0;
				if ( id.equals(Netflix.user[1]) && pw.equals(Netflix.user[2]) ) {
					result = 1;
				} else { 
					result = 0;			
			}
			return result;
	}
// ----------------------------------------------------------------
	
	
// --------------------- 입력정보 출력 함수--------------------
	public void printInput(String getId) {
		System.out.print("    [ ID : " + getId);
	}
//-----------------------------------------------------------------
	

// ----------------------- 결과 출력 함수 ----------------------
	public void printResult(int result) {

		if (result == 1 ) {
			System.out.println("      " + Netflix.user[0] + "님 환영합니다!");			
		} else if (
			result == 0 ) {
			System.out.println("  아이디 혹은 비밀번호를 확인 해주세요!");
		} else {
//			pass
		}
	}
// --------------------------------------------------------------
}