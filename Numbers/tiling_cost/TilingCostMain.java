package tiling_cost;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.Scanner;

public class TilingCostMain {
	private double getUserParams() {
		Scanner input = new Scanner(System.in);
		double result = input.nextDouble();
		
		return result;
	}
	
	private double calcCost(Floor floor, Tile tile) {
		double cost = floor.getArea() / tile.getArea() * tile.getCostPerSqMetre();
		
		BigDecimal bd = new BigDecimal(Double.toString(cost));
		bd = bd.setScale(2, RoundingMode.HALF_UP);
		cost = bd.doubleValue();
		
		return cost;
	}
	
	public static void main(String[] args) {
		double floorWidth;
		double floorLength;
		double tileCost;
		double tilingCost;
		
		TilingCostMain tc = new TilingCostMain();
		
		//Header
		System.out.println(String.format("%60s", " ").replaceAll(" ", "="));
		System.out.println("TILING COST CALCULATOR");
		System.out.println(String.format("%60s", " ").replaceAll(" ", "="));
		
		//Get length
		System.out.println("Step 1. Enter length of floor (in metres)");
		System.out.print("> ");
		floorLength = tc.getUserParams();
		
		System.out.println(" ");
		
		//Get width
		System.out.println("Step 2. Enter width of floor (in metres)");
		System.out.print("> ");
		floorWidth = tc.getUserParams();
		
		//Create Floor object
		Floor floor = new Floor(floorWidth, floorLength);
		
		//Get cost
		System.out.println(" ");
		System.out.println("Step 3. Enter cost of tile (in dollars per square metre)");
		System.out.print("> ");
		tileCost = tc.getUserParams();
		
		//Create Tile object
		Tile tile = new Tile(tileCost);
		
		System.out.println(String.format("%60s", " ").replaceAll(" ", "-"));
		
		//Calculate cost of tiling
		tilingCost = tc.calcCost(floor, tile);
		System.out.println("The cost of tiling a " + floor.getLength() + "m by " + floor.getWidth() + "m floor with tiles");
		System.out.println("costing $" + String.format("%.2f", tile.getCostPerSqMetre()) + " per sqm is $" + tilingCost + ".");
		
		System.out.println(String.format("%60s", " ").replaceAll(" ", "-"));
	}
}
