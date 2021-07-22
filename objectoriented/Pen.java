package objectoriented;

public class Pen {
	private String color;
	private int height;
	
	void writeMessage(String message) {
		System.out.println("Mesajýnýz : " + message);
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String color) {
		if("red".equals(color) || "blue".equals(color) || "black".equals(color))
			this.color = color;
		else
			throw new IllegalArgumentException();
	}

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}
	
	
}
