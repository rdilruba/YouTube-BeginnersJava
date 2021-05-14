package deneme;

public class Functions {

	public static void main(String[] args) {
		int top1 = 7;
		int top2 = 6;
		int dönenCevap = toplama(top1,top2);
		System.out.println(dönenCevap);
		System.out.println(merhaba("Dilruba"));
		System.out.println(yýlBul(23));
		bye();
		bye();
		System.out.println(yýlBul(34));
	}

	public static int toplama(int sayý1, int sayý2) {
		int cevap;
		cevap = sayý1 + sayý2;
		return cevap;
	}
	
	public static String merhaba(String ad) {
		return "Merhaba " + ad;
	}
	
	public static String yýlBul(int yaþ) {
		int yýl = 2021 - yaþ;
		yýl--;
		return yýl + " yýlýnda doðdunuz.";
	}
	
	public static void bye() {
		System.out.println("Görüþürüz.");
	}
}
