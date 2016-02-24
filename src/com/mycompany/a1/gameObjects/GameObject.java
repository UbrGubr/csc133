package com.mycompany.a1.gameObjects;

public abstract class GameObject {
	private double xLocation; //Non-negative values in range 0.0 to 1000.0
	private double yLocation; //Non-negative values in range 0.0 to 610.0
	private int color; 
	
	//Getter methods
	public double getXLocation() {
		return xLocation;
	}
	public double getYLocation() {
		return yLocation;
	}
	public void setXLocation(double x) {
		xLocation = x;
	}
	public int getColor() {
		return color;
	}
	
	//Setter methods
	public void setYLocation(double y) {
		yLocation = y;
	}
	public void setColor(int c) {
		color = c;
	}
}
