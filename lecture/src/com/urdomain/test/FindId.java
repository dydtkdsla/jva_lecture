package com.urdomain.test;

public class FindId {
	public static void main(String[] args) {

		// DB
		String[] db = { "이용상", "0123456789", "dldydtkd@email.com" };
		// 입력정보
		String name = "이용상";
		String id = "0123456789";
		String email = "dldydtkd@email.com";
		// id 배열화
		char[] idCharArray = id.toCharArray();
		
		// id 글자 수에 따른 * 치환 개수
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
			System.out.println("안녕하세요. " + name + "님!");
			System.out.println("입력하신 " + email + "로 가입된 ID는[ " + newId + "]입니다!");
		} else {
			System.out.println("입력하신 " + email + "로 가입된 ID가 없습니다!");
		}
		

	
				
		
	}
}
// 이름도 넣어서, user[0]에서 몇글자만 **로 나오게