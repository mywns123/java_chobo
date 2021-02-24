package java_chobo.ch07.poly;

abstract class Animal {
	abstract void cry();

	abstract void eat();
} // Animal

class Lion extends Animal {

	@Override
	void cry() {
		System.out.println("어흥");
	}

	@Override
	void eat() {
		System.out.println("잡아먹다");
	}

} // Lion

class Dog extends Animal {
	@Override
	void cry() {
		System.out.println("월월");
	}

	@Override
	void eat() {
		throw new UnsupportedOperationException();
	}

} // Dog

class Cat extends Animal {
	@Override
	void cry() {
		System.out.println("야옹");
	}

	@Override
	void eat() {
		throw new UnsupportedOperationException();
	}
} // Cat

class Bird extends Animal {
	@Override
	void cry() {
		System.out.println("꼬꼬댁");
	}

	@Override
	void eat() {
		throw new UnsupportedOperationException();
	}
} // Bird

public class Main {
	public static void main(String[] args) {
		Animal[] anis = new Animal[4];
		anis[0] = new Dog();
		anis[1] = new Cat();
		anis[2] = new Bird();
		anis[3] = new Lion();

		for (Animal ani : anis) {
			ani.cry();
			if(ani instanceof Lion) {
				((Lion)ani).eat();
			}
		} // for

	} // main
}// class