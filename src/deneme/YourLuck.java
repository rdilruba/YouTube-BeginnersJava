package deneme;

import java.util.Scanner;

public class YourLuck {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner okuyucu = new Scanner(System.in);
		System.out.println("�sminiz nedir?");
		String isim = okuyucu.next();
		System.out.println("Merhaba, " + isim);
		System.out.println("Ya��n�z ka�?");
		int ya� = okuyucu.nextInt();
		System.out.println("�ansl� say�n�z :");
		
		int harfSay�s� = isim.length();
		
		int �ansl�Say� = 0;
		
		if(ya�<15) {
			
			�ansl�Say� = (harfSay�s� * ya�) % 10;
			
		}else if(ya�<20){
			
			�ansl�Say� = (ya� *ya� - harfSay�s�) % 10;
			
		}else if(ya�<40){
			
			�ansl�Say� = (harfSay�s� - ya�) % 10;
			
		}else if(ya�<60) {
			
			�ansl�Say� = (ya� + harfSay�s�) % 10;
			
		}else {
			
			�ansl�Say� = (harfSay�s� * 5 - ya�) % 10;
			//fjfjfjfj
		}
		
		if(�ansl�Say� < 0)
			�ansl�Say� = �ansl�Say� * -1;
		
		
		System.out.println(�ansl�Say�);
		
	}

}
