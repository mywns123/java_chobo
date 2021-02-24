package java_chobo.ch07.vec;

public class Student {
	int stdNO; // 학번
	String name; // 성명
	int kor;
	int eng;
	int math;

	public Student(int stdNO, String name, int kor, int eng, int math) {
		this.stdNO = stdNO;
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
	}

	public Student(int stdNO) {
		this.stdNO = stdNO;
	}

	public int total() {
		return kor + eng + math;
	}

	public double avg() {
		return total() / 3D;
	}

	@Override
	public String toString() {
		return String.format("%3d %5s %3d %3d %3d %3d %.1f", stdNO, name, kor, eng, math, total(), avg());
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + stdNO;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student other = (Student) obj;
			if (stdNO != other.stdNO)
				return true;
		}
		return false;
	}

} // end of class
