package fonksiyonlarda_return;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

import java.util.Date;
public class Fonksiyonlarda_return {
public static int ucilecarp(int a) {
		
		return a*3;
	}
	
	public static int ikiiletopla(int a) {
	
	return a+2;
	}
	
	public static int bescikar(int a) {
		
		return a-5;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		System.out.println("Girmek istediginiz sayi =");
		int sayi =scan.nextInt();
		System.out.println("Sonuc = "+bescikar(ikiiletopla(ucilecarp(sayi))));//sirayla en icten baslayip dısa dogru gidiyor
		
	}

}
