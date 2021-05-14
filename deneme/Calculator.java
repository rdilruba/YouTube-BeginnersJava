package deneme;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Hesap makineme hoşgeldiniz.");
		System.out.println("Hesaplamak istediğiniz 2 sayıyı giriniz :");
		int sayıBir = okuyucu.nextInt();
		int sayıİki = okuyucu.nextInt();
		System.out.println("Hangi işlemi yapmak istersiniz? (*,/,-,+)");
		char işlem = okuyucu.next().charAt(0);
		int sonuç;
		switch(işlem) {
		
		case '+':
				sonuç = sayıBir + sayıİki;
				System.out.println(sayıBir + " + " + sayıİki + " = " +sonuç);
				break;
			
		case '-':
				sonuç = sayıBir - sayıİki;
				System.out.println(sayıBir + " - " + sayıİki + " = " +sonuç);
				break;
			
		case '*':
				sonuç = sayıBir * sayıİki;
				System.out.println(sayıBir + " * " + sayıİki + " = " +sonuç);
				break;
		case '/': 
				sonuç = sayıBir / sayıİki;
				System.out.println(sayıBir + " / " + sayıİki + " = " +sonuç);
				break;
				
		default : System.out.println("Çarpma,bölme,çıkarma "
				+ "veya toplama işlemi seçiniz.");
		}
		okuyucu.close();
		
	}

}
