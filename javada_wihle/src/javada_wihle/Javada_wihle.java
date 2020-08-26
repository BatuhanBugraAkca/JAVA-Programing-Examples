package javada_wihle;
import java.util.Locale;
import java.util.Scanner;

import java.util.List;
import java.util.ArrayList;

import java.util.Date;
/*	BU UYGULAMADA DO WHILE in onemini göstermek için yazılmıstır */

public class Javada_wihle {

	public static void main(String[] args) {/* kodu iki kez tekrarlamak yerine do while da yapabilir veya terkari basta 1 olarak tanımlar donguye girmesini saglar daha sonra tekrar klavyeden alırdık*/
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);//scanerlarımızı tanımlıyoruz
		System.out.println("Lutfen girmek istediginiz sayi adetini giriniz = ");
		int adet =scan.nextInt();
		System.out.println("Lutfen numaralarinizi giriniz");//tekrar ediceği adeti alıp o adet kadar sayi isteyen basic bir java uygulaması
		while(adet!=0){
			int sayi1 =scan.nextInt();	
			if(sayi1==4) {
				System.out.println("Dogru sayiyi buldunuz (tekrar icin 1 e basiniz) ");
				break;
			}
			
			adet--;
		}
		int tekrar=scan.nextInt();
		
		while(tekrar==1) {
			
			System.out.println("Lutfen girmek istediginiz sayi adetini giriniz = ");
			int adet1 =scan.nextInt();
			System.out.println("Lutfen numaralarinizi giriniz");
			while(adet1!=0){
				int sayi1 =scan.nextInt();	
				if(sayi1==4) {
					System.out.println("Dogru sayiyi buldunuz (tekrar icin 1 e basiniz)");
					break;
				}	
				adet1--;
				}
		
			}
		}
}
