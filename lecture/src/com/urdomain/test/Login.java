package com.urdomain.test;

public class Login {
	public static void main(String[] args) {
		Login login = new Login();
		
		// 입력정보
		String getId = "dldydtkd";
		String getPw = "1234";
		
		// 함수 사용
		int a = 0;	
		
		a = login.resultCheck(getId, getPw);
		login.syso(a);

	}
		
//		판단 함수
	public int resultCheck(String id, String pw) {
		// db정보
		String[] user = { "dldydtkd", "1234" };

		// db : 입력 판단
		int result = 0;
				if ( id.equals(user[0]) && pw.equals(user[1]) ) {
					result = 1;
				} else { 
					result = 0;			
			}
			return result;
	}
	
//		출력 함수
	public void syso(int result) {

		if (result == 1 ) {
			System.out.println("환영!");			
		} else if (
			result == 0 ) {
			System.out.println("다시!");
		} else {
//			pass
		}
	}
}