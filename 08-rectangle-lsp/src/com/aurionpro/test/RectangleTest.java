package com.aurionpro.test;

import com.aurionpro.model.Rectangle;
import com.aurionpro.model.Square;

public class RectangleTest {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle(10, 20);
		Square s1 = new Square(10);
	     System.out.println(isRectangle(s1));

	}
	public static boolean  isRectangle(Rectangle s1) {
		
		int prev = s1.getWidth();//20
        System.out.println(prev);
		
		s1.setHeight(100);
		int curr = s1.getWidth();
	    System.out.println(curr);
	
		return prev==curr?true:false;
	}

}
