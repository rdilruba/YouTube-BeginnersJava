package objectoriented;

public class Vehicle implements Engine {

	int numberOfSeats;
	int numberOfWheels;
	
	public void start() {
		System.out.println("Ara� �al���yor...");
	}

	@Override
	public void stop() {
		System.out.println("Ara� durdu...");
		
	}
}
