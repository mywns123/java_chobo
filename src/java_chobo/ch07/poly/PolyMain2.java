package java_chobo.ch07.poly;

public class PolyMain2 {

	public static void main(String[] args) {
		Car car1 = new Car();
		prnInstanceOf(car1);

		prnInstanceOf(new Ambulance("red", 4));
		prnInstanceOf(new FireEngine());
	}

	private static void prnInstanceOf(Object obj) {
		if (obj instanceof Object) {
			System.out.println("Object instance");
		}

		if (obj instanceof Car) {
			System.out.println("Car instance");
		}

		if (obj instanceof Ambulance) {
			System.out.println("Ambulance instance");
		}

		if (obj instanceof FireEngine) {
			System.out.println("FireEngine instance");
		}
	}

}
