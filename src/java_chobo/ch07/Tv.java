package java_chobo.ch07;

public class Tv {
	boolean power;
	int channel;

	void power() {
		power = !power;
	}

	void channelUP() {
		++channel;
	}

	void channelDOWN() {
		--channel;
	}
}
