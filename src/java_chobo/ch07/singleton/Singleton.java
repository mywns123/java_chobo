package java_chobo.ch07.singleton;

public class Singleton {

	private static final Singleton instance = new Singleton();

	 Singleton() {
		// TODO Auto-generated constructor stub
	}

	public static Singleton getInstance() {
		return instance;
	}

}
