package objectoriented;

public class Vehicle implements Engine {

	private int numberOfSeats;
	private int numberOfWheels;
	
	public void start() {
		System.out.println("Ara� �al���yor...");
	}

	@Override
	public void stop() {
		System.out.println("Ara� durdu...");
		
	}

	public int getNumberOfSeats() {
		return numberOfSeats;
	}

	public void setNumberOfSeats(int numberOfSeats) {
		this.numberOfSeats = numberOfSeats;
	}

	public int getNumberOfWheels() {
		return numberOfWheels;
	}

	public void setNumberOfWheels(int numberOfWheels) {
		this.numberOfWheels = numberOfWheels;
	}
}
