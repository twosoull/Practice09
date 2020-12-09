package com.javaex.ex04;

public class Rectangle extends Shape implements Resizeable {
	//filed
	private double width;
	private double height;
	
	//constructor
	public Rectangle() {
	}

	public Rectangle(double width, double height) {
		this.width = width;
		this.height = height;
	}
	public Rectangle(int countSides,double width, double height) {
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
	
	public double getArea() { //넓이
		return width*height;
	}
	
	public double getPerimeter() {
		return (width+height)*2;
	}
	
	public void resize(double s) {
		 this.width = width*s;
		 this.height = height*s;
	}
	@Override
	public String toString() {
		return "Rectangle [width=" + width + ", height=" + height + ", getPerimeter()=" + getPerimeter() + "]";
	}
	

}
