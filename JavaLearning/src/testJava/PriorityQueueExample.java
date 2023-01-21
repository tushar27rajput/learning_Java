package testJava;

import java.util.PriorityQueue;

public class PriorityQueueExample 
{

	public static void main(String[] args) 
	{
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();
		
		// Adding elements to the PriorityQueue

		pq.add(10);
		pq.add(20);
		pq.add(30);
		pq.add(40);
		pq.add(50);
		
		// Printing the most priority element
		System.out.println("Head value using peek function: " +pq);
		
		// Printing all elements
		System.out.println("The queue elements:");
		for(Integer element : pq)
		{
			System.out.println(element);
		}
		
		// Removing the top priority element (or head) and
	    // printing the modified pq
		
		pq.poll();
		System.out.println("After removing an element with poll function:");
		for(Integer element : pq)
		{
			System.out.println(element);
		}
		
		// Removing 30 using remove()
		
		pq.remove(30);
		System.out.println("after removing 30 with" + " remove function:");
		for(Integer element : pq)
		{
			System.out.println(element);
		}
		

	}

}
