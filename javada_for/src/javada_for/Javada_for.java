package javada_for;
import java.util.Locale;
import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;
import java.util.Date;

public class Javada_for {
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		scan.useLocale(Locale.US);//scanerlarimizi tanimliyoruz
		
		System.out.println("Kac adet denemek istediginizi giriniz ");
		
		int kackere =scan.nextInt();
		int j =0;
		
		for(int i=0; i < kackere ;i++) {
			System.out.println("Girmek istediginiz sayi =");
			int sayi =scan.nextInt();
			if(sayi==5) {
				System.out.println("Dogru sayiyi buldunuz !!!!");
				
			}
			else {
				j++;
				System.out.println("!!!!Yanlis sayi deneme "+(kackere-j)+" hakkiniz kalmistir!!!!!");

			}
			
		}
	
	
	}

	
}
