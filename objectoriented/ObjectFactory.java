package objectoriented;

public class ObjectFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.color = "Pembe";
		firstPen.height = 10;
		String message = "Ýlk kalem üretildi.";
		
		firstPen.writeMessage(message);
		
		Pen secondPen = new Pen();
		secondPen.color = "Mavi";
		secondPen.height = 8;
		secondPen.writeMessage(secondPen.color + " " + secondPen.height);
		
		Car car = new Car();
		car.numberOfSeats = 5;
		car.numberOfWheels = 4;
		
		Bicycle bicycle = new Bicycle();
		bicycle.numberOfSeats = 1;
		bicycle.numberOfWheels = 2;

		Vehicle car2 = new Car();
		
		car.start();
		bicycle.start();
		car2.start();
		
	}

}
