package deneme;

import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Hesap makineme ho�geldiniz.");
		System.out.println("Hesaplamak istedi�iniz 2 say�y� giriniz :");
		int say�Bir = okuyucu.nextInt();
		int say��ki = okuyucu.nextInt();
		System.out.println("Hangi i�lemi yapmak istersiniz? (*,/,-,+)");
		char i�lem = okuyucu.next().charAt(0);
		int sonu�;
		switch(i�lem) {
		
		case '+':
				sonu� = say�Bir + say��ki;
				System.out.println(say�Bir + " + " + say��ki + " = " +sonu�);
				break;
			
		case '-':
				sonu� = say�Bir - say��ki;
				System.out.println(say�Bir + " - " + say��ki + " = " +sonu�);
				break;
			
		case '*':
				sonu� = say�Bir * say��ki;
				System.out.println(say�Bir + " * " + say��ki + " = " +sonu�);
				break;
		case '/': 
				sonu� = say�Bir / say��ki;
				System.out.println(say�Bir + " / " + say��ki + " = " +sonu�);
				break;
				
		default : System.out.println("�arpma,b�lme,��karma "
				+ "veya toplama i�lemi se�iniz.");
		}
		okuyucu.close();
		
	}

}
