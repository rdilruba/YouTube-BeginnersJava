package objectoriented;

public class ObjectFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.color = "Pembe";
		firstPen.height = 10;
		String message = "�lk kalem �retildi.";
		
		firstPen.writeMessage(message);
		
		Pen secondPen = new Pen();
		secondPen.color = "Mavi";
		secondPen.height = 8;
		secondPen.writeMessage(secondPen.color + " " + secondPen.height);
	}

}
