package java_chobo.ch07.singleton;

public class Main {

	public static void main(String[] args) {
//		Singleton st =new Singleton();
		Unsingleton us1 = new Unsingleton();
		Unsingleton us2 = new Unsingleton();

		System.out.println(us1);
		System.out.println(us2);

		Singleton si1 = Singleton.getInstance();
		Singleton si2 = Singleton.getInstance();

		System.out.println(si1);
		System.out.println(si2);

		Singleton si3 = new Singleton();
		System.out.println(si3);
		
	}

}
