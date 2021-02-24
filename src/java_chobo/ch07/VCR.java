package java_chobo.ch07;

public class VCR {
	boolean power;
	int counter;

	public void power() {
		this.power = !this.power;
	}

	public void play() {
		System.out.println("VCR Play");
	}

	public void stop() {
		System.out.println("VCR Stop");
	}

	public void rew() {
		System.out.println("VCR rew");
	}

	public void ff() {
		System.out.println("VCR ff");
	}

}
