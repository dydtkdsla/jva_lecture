package com.urdomain.ch10;

public class AccountExample {
	public static void main(String[] args) {
		Account account = new Account();
		//�����ϱ�
		account.deposit(10000);
		System.out.println("���ݾ� : " + account.getBalance());
		//����ϱ�
		try {
			account.withdraw(30000);
		} catch(BalanceInsufficientException e) {
			String messege = e.getMessage();
			System.out.println(messege);
			System.out.println();
			e.printStackTrace();
		}
	}
}
