package com.urdomain.test;

public class Login {
	public static void main(String[] args) {
		Login login = new Login();
		
		// �Է�����
		String getId = "dldydtkd";
		String getPw = "1234";
		
		// �Լ� ���
		int a = 0;	
		
		a = login.resultCheck(getId, getPw);
		login.syso(a);

	}
		
//		�Ǵ� �Լ�
	public int resultCheck(String id, String pw) {
		// db����
		String[] user = { "dldydtkd", "1234" };

		// db : �Է� �Ǵ�
		int result = 0;
				if ( id.equals(user[0]) && pw.equals(user[1]) ) {
					result = 1;
				} else { 
					result = 0;			
			}
			return result;
	}
	
//		��� �Լ�
	public void syso(int result) {

		if (result == 1 ) {
			System.out.println("ȯ��!");			
		} else if (
			result == 0 ) {
			System.out.println("�ٽ�!");
		} else {
//			pass
		}
	}
}