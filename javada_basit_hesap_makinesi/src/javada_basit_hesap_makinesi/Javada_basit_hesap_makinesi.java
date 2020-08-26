package javada_basit_hesap_makinesi;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

import java.util.Date;

public class Javada_basit_hesap_makinesi {
public static void main(String[] args) {
		
		System.out.println("Birinci sayiyi giriniz = ");
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);
		int a = scan.nextInt();
		System.out.println("İkinci sayiyi giriniz = ");
		int b =scan.nextInt();
		System.out.println("Yapilcak islemi seciniz (+,-,/,*)");
		char c =scan.next().charAt(0);
		if(c =='+') {
			System.out.println("Sonuc = "+(a+b));
		}
		else if(c=='-') {
		
			System.out.println("Sonuc = "+(a-b));

		}
		
		else if(c=='*') {
			System.out.println("Sonuc = "+(a*b));
	
		}
		else if(c=='/') {
			System.out.println("Sonu ="+(a/b));
			
			
		}
	
	}
	
	


}
