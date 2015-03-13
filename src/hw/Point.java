/*Michael Womack
 * CS 3401-01
 * Assignment 3
 * 1/31/15     
 */

package hw;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class Point {
	private int x,y;
	
	public Point(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	/**
	 * @class will implement Comparator interface and override the compare method
	 * to compare the X coordinates first.
	 *
	 */
	 static class CompareX implements Comparator<Point>{
		
		public CompareX(){}
		
		public int compare(Point p1, Point p2){
			
			if (p1.x > p2.x)
				return 1;
			else if (p1.x < p2.x)
				return -1;
			else if (p1.y > p2.y)
				return 1;
			else if (p1.y < p2.y)
				return -1;
			else
				return 0;
		}		
	}
	
	/**
	 * @class will implement Comparator interface and override the compare method
	 * to compare the Y coordinates first.
	 *
	 */
	static class CompareY implements Comparator<Point>{
		
		public CompareY(){}
		
		public int compare(Point p1, Point p2){
			
			if (p1.y > p2.y)
				return 1;
			else if (p1.y < p2.y)
				return -1;
			else if (p1.x > p2.x)
				return 1;
			else if (p1.x < p2.x)
				return -1;
			else 
				return 0;		
		}
	}
	
	
	public static void main(String[] args) {
		
		List<Point> pointList = new ArrayList<Point>();
		
		for(int i = 0; i < 100; i++){
			
			int x = (int)(Math.random() * 99);
			int y = (int)(Math.random() * 99);
			pointList.add(new Point(x, y));
		}
		
		Collections.sort(pointList, new CompareX());
		System.out.println("CompareX:");
		for(Point i: pointList)
			System.out.printf("(%d,%d) ", i.x,i.y);
		
		Collections.sort(pointList, new CompareY());
		System.out.println("\n\nCompareY:");
		for(Point i: pointList)
			System.out.printf("(%d,%d) ", i.x,i.y);
	}
}


