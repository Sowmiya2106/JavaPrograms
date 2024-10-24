//Program demonstrate constructor overloading - compile time polimorphism
package ProgramPacks20;

public class Point {
	
	private float x;
	private float y;
	
	public Point() {
		x = 0.0f;
		y = 0.0f;
	}
	
	public Point (float x) {
		this.x = x;
		this.y = y;
	}

	@Override
	public String toString() {
		return "Point [x=" + x + ", y=" + y + "]";
	}
	
	
}
