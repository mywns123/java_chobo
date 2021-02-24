package java_chobo.ch07.overriding;

public class Point3D extends Point {
	int z;

	@Override
	public String getLocation() {
//		return String.format("%d, %d, %d%n", x, y, z);
//		return String.format("%s, %d%n", super.getLocation(), z);
		return super.getLocation() + String.format(", z = %d", z);
	}

}
