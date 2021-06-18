package objectoriented;

public class Vehicle implements Engine {

	int numberOfSeats;
	int numberOfWheels;
	
	public void start() {
		System.out.println("Araç çalýþýyor...");
	}

	@Override
	public void stop() {
		System.out.println("Araç durdu...");
		
	}
}
