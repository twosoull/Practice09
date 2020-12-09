package com.javaex.ex04;

import java.util.ArrayList;
import java.util.List;

public class ShapeApp {
	public static void main(String[] args) {
		Rectangle rectangle = new Rectangle(5,6);
		RecTriangle recTriangle = new RecTriangle(6,2);
		
		List<Shape> sArray = new ArrayList<Shape>();
		
		
		sArray.add(rectangle);
		sArray.add(recTriangle);
		
		for(int i =0; i<sArray.size(); i++) {
			System.out.println("area :"+sArray.get(i).getArea());
			System.out.println("perimeter:"+ sArray.get(i).getPerimeter());
			if(sArray.get(i) instanceof Resizeable) {
				((Rectangle)sArray.get(i)).resize(0.5);
				System.out.println("new area :"+sArray.get(i).getArea());
				System.out.println("new perimeter:"+ sArray.get(i).getPerimeter());
			}
		}
		
	}
}
