package com.urdomain.ch07;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("Computer °´Ã¼ÀÇ areaCirle() ½ÇÇà");
		return Math.PI * r * r;
	}
}
