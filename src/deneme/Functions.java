package deneme;

public class Functions {

	public static void main(String[] args) {
		int top1 = 7;
		int top2 = 6;
		int d�nenCevap = toplama(top1,top2);
		System.out.println(d�nenCevap);
		System.out.println(merhaba("Dilruba"));
		System.out.println(y�lBul(23));
		bye();
		bye();
		System.out.println(y�lBul(34));
	}

	public static int toplama(int say�1, int say�2) {
		int cevap;
		cevap = say�1 + say�2;
		return cevap;
	}
	
	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}
	
	public static String y�lBul(int ya�) {
		int y�l = 2021 - ya�;
		y�l--;
		return y�l + " y�l�nda do�dunuz.";
	}
	
	public static void bye() {
		System.out.println("G�r���r�z.");
	}
}
