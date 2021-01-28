package com.urdomain.ch11;

public class Key {
	public int number;
	
	public Key(int number) {
		this.number = number;
	}
	
	@Override
	public int hashCode() {
		return number;
	}
}
