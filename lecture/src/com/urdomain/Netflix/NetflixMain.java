package com.urdomain.Netflix;

public class NetflixMain {
	public static void main(String[] args) {
		NetflixMain netflixMain = new NetflixMain();
		
		System.out.println(Netflix.brand);
		netflixMain.wun();
		netflixMain.tv();
		netflixMain.original();
		netflixMain.blockbuster();
		
	}
//		지금 뜨는 콘텐츠
	public void wun() {
		System.out.println("");
		System.out.println(NetflixMainContents.whatsUpNow);
		int i = NetflixMainContents.wUContents.length;
		for( int j=0; j<i; j++) {
			System.out.print(" [" + NetflixMainContents.wUContents[j] + "] ");
		}
		System.out.println("");
	}
//		TV 프로그램
	public void tv() {
		System.out.println("");
		System.out.println(NetflixMainContents.tvProgram);
		int i = NetflixMainContents.tvContents.length;
		for(int j=0; j<i; j++) {
			System.out.print(" [" + NetflixMainContents.tvContents[j] + "] ");
		}
		System.out.println("");
	}
//		NETFLIX ORIGINAL
	public void original() {
		System.out.println("");
		System.out.println(NetflixMainContents.original);
		int i = NetflixMainContents.netflixOriginal.length;
		for(int j=0; j<i; j++) {
			System.out.print(" [" + NetflixMainContents.netflixOriginal[j] + "] ");
		}
		System.out.println("");
	}
//		블록버스터 영화
	public void blockbuster() {
		System.out.println("");
		System.out.println(NetflixMainContents.bMovie);
		int i = NetflixMainContents.blockbuster.length;
		for(int j=0; j<i; j++) {
			System.out.print(" [" + NetflixMainContents.blockbuster[j] + "] ");
		}
		System.out.println("");
	}
}
