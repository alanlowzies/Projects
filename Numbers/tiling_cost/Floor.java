package tiling_cost;

public class Floor {
	//Assume floor is a simple rectangle/square
	
	private double width;
	private double length;
	private double area;
	
	public Floor(double width, double length) {
		this.width = width;
		this.length = length;
		this.area = width*length;
	}
	
	public double getWidth() {
		return width;
	}
	public double getLength() {
		return length;
	}
	public double getArea() {
		return area;
	}
}
