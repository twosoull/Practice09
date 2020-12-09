package com.javaex.ex04;

public class RecTriangle extends Shape{
	private double width;
	private double height;
	
	//constructor
	public RecTriangle() {
	}

	public RecTriangle(double w, double h) {
		this.width = w;
		this.height =h;
	}
	public RecTriangle(int countSides, double width, double height) {
		super(countSides);
		this.width = width;
		this.height = height;
	}
	
	//method g/s
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	//method
	public double getArea() {
		return (width*height)/2d;
	}
	
	public double getPerimeter() {
		return width+height+Math.sqrt((width*width)+(height+height));
	}

	@Override
	public String toString() {
		return "RecTriangle [width=" + width + ", height=" + height + ", getCountSides()=" + getCountSides() + "]";
	}

	
}
