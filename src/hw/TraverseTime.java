/*Michael Womack
 * CS 3401-01
 * Assignment 3
 * 1/31/15     
 */
package hw;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class TraverseTime {

	public static void main(String[] args) {
		List<Integer> list = new LinkedList<>();
		
		for(int i = 0; i < 5000000; i++){
			list.add(i);
		}
		
		Iterator<Integer> iterator = list.iterator();
		
		long startTime = System.currentTimeMillis();
		
		for(int i = 0; i < list.size(); i++)
			iterator.next();
		
		System.out.printf("Time to traverse by iterator is %d milliseconds\n", 
								(System.currentTimeMillis() - startTime));
			
		startTime = System.currentTimeMillis();
		for(int i = 0; i < list.size(); i++)
			list.get(i);
			
		System.out.printf("Time to traverse by get() is %d milliseconds\n", 
								(System.currentTimeMillis() - startTime));
	}
}
