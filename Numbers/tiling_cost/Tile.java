package tiling_cost;

public class Tile {
	//Assume standard floor tile dimension is 0.6m by 0.6m
	//Cost is provided by user
	
	private double side = 0.6;
	private double area = 0.6 * 0.6;
	private double costPerSqMetre;
	
	public Tile(double costPerSqMetre) {
		this.costPerSqMetre = costPerSqMetre;
	}
	
	public double getCostPerSqMetre() {
		return costPerSqMetre;
	}
	public double getSide() {
		return side;
	}
	public double getArea() {
		return area;
	}
	
	
}
