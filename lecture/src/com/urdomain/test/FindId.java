package com.urdomain.test;

public class FindId {
	public static void main(String[] args) {

		// DB
		String[] db = { "�̿��", "0123456789", "dldydtkd@email.com" };
		// �Է�����
		String name = "�̿��";
		String id = "0123456789";
		String email = "dldydtkd@email.com";
		// id �迭ȭ
		char[] idCharArray = id.toCharArray();
		
		// id ���� ���� ���� * ġȯ ����
		if(id.length() >= 1 && id.length() < 3) {
			//pass
		} else if (
			id.length() == 3) {
			idCharArray[1] = '*';
		} else if (
			id.length() == 4 || id.length() == 5) {
			idCharArray[1] = '*';
			idCharArray[2] = '*';
		} else if (
			id.length() == 6 || id.length() == 7) {
			idCharArray[2] = '*';
			idCharArray[3] = '*';
			idCharArray[4] = '*';
		} else if (
			id.length() == 8 || id.length() == 9) {
			idCharArray[2] = '*';
			idCharArray[3] = '*';
			idCharArray[4] = '*';
			idCharArray[5] = '*';
		} else {
			idCharArray[2] = '*';
			idCharArray[3] = '*';
			idCharArray[4] = '*';
			idCharArray[5] = '*';
			idCharArray[6] = '*';
		}
		
		String newId = String.valueOf(idCharArray);
		
		if(id == db[1]) {
			System.out.println("�ȳ��ϼ���. " + name + "��!");
			System.out.println("�Է��Ͻ� " + email + "�� ���Ե� ID��[ " + newId + "]�Դϴ�!");
		} else {
			System.out.println("�Է��Ͻ� " + email + "�� ���Ե� ID�� �����ϴ�!");
		}
		

	
				
		
	}
}
// �̸��� �־, user[0]���� ����ڸ� **�� ������