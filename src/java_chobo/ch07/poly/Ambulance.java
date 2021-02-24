package java_chobo.ch07.poly;

public class Ambulance extends Car {

	public void siren() {
		System.out.println("siren~~!!");
	}

	public Ambulance() {
		// TODO Auto-generated constructor stub
	}

	public Ambulance(String color, int door) {
		super(color, door);
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return String.format("Ambulance [toString()=%s]", super.toString());
	}
	
	
}
