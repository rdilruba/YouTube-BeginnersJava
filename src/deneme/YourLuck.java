package deneme;

import java.util.Scanner;

public class YourLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("Ýsminiz nedir?");
		String isim = okuyucu.next();
		System.out.println("Merhaba, " + isim);
		System.out.println("Yaþýnýz kaç?");
		int yaþ = okuyucu.nextInt();
		System.out.println("Þanslý sayýnýz :");
		
		int harfSayýsý = isim.length();
		
		int þanslýSayý = 0;
		
		if(yaþ<15) {
			
			þanslýSayý = (harfSayýsý * yaþ) % 10;
			
		}else if(yaþ<20){
			
			þanslýSayý = (yaþ *yaþ - harfSayýsý) % 10;
			
		}else if(yaþ<40){
			
			þanslýSayý = (harfSayýsý - yaþ) % 10;
			
		}else if(yaþ<60) {
			
			þanslýSayý = (yaþ + harfSayýsý) % 10;
			
		}else {
			
			þanslýSayý = (harfSayýsý * 5 - yaþ) % 10;
			//fjfjfjfj
		}
		
		if(þanslýSayý < 0)
			þanslýSayý = þanslýSayý * -1;
		
		
		System.out.println(þanslýSayý);
		
	}

}
