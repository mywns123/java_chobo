package java_chobo.ch06.dto;

public class Car {
	String color;
	String gearType;
	int door;

	public Car() {
		/*
		 * color = "white"; gearType = "auto"; door = 4;
		 */		
		this("white", "auto", 4);
		System.out.println();
	}
public Car(Car car) {
	this.color = car.color;
	this.gearType = car.gearType;
	this.door = car.door;
	
}
	public Car(String color, String gearType, int door) {
		this.color = color;
		this.gearType = gearType;
		this.door = door;
	}
	@Override
	public String toString() {
		return String.format("Car [color=%s, gearType=%s, door=%s]", color, gearType, door);
	}

	
	
	
	
	
	
}
