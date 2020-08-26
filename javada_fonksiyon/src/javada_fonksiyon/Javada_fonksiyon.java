package javada_fonksiyon;

import java.util.Locale;
import java.util.Scanner;

public class Javada_fonksiyon {
	public static void islem(int a,int b) {
		System.out.println("Toplama isleimi sonucu = "+(a+b));
		
		
	}
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);//scanerlarimizi tanimliyoruz
		System.out.println("Birinci sayiyi giriniz=");
		int a =scan.nextInt();
		System.out.println("ikinci sayiyi giriniz=");
		int b =scan.nextInt();
		islem(a,b);

		
		
	}

	
}
