package objectoriented;

public class ObjectFactory {

	public static void main(String[] args) {
		
		Pen firstPen = new Pen();
		firstPen.setColor("red");
		firstPen.setHeight(10);
		String message = "Ýlk kalem üretildi.";
		
		firstPen.writeMessage(message);
		
		Pen secondPen = new Pen();
		secondPen.setColor("blue"); //encapsulation
		secondPen.setHeight(8);
		secondPen.writeMessage(secondPen.getColor() + " " + secondPen.getHeight());
		
		Car car = new Car();
		car.setNumberOfSeats(5);
		car.setNumberOfWheels(4);
		
		Bicycle bicycle = new Bicycle();
		bicycle.setNumberOfSeats(1);
		bicycle.setNumberOfWheels(2);

		Vehicle car2 = new Car(); //Polymorphism
		Engine engine = new Car(); //Polymorphism
		car2.stop();
		
		car.start();
		bicycle.start();
		car2.start();
		
		//Polymorphism usage example
		Vehicle[] vehicles = new Vehicle[10];
		vehicles[0] = car;
		vehicles[1] = bicycle;
		vehicles[2] = car2;
	}

}
