package testJava;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Book
{
	int id;
	int quantity;
	String name,author,publisher;
	public Book(int id, int quantity, String name, String  author, String publisher)
	{
		this.id = id;
		this.quantity = quantity;
		this.name = name;
		this.author = author;
		this.publisher = publisher;
		
	}
}

public class ListIteratorExample 
{
	public static void main(String args[])
	{
		//Creating list of Books
		List<Book> list = new ArrayList<Book>();
		
		//Creating Book
		Book b1 = new Book(101,10,"Let us C","Yashwant Kanetkar","BPB");
		Book b2 = new Book(102,30,"Java Program Questation","Rajendra","Technolamror");
		Book b3 = new Book(103,40,"Operating System","Galvin","Wiley");
		
		//Adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);
		
		System.out.println("Original content of list is: ");
		
		//Traversing List
		
		for(Book b:list)
		{
			System.out.println(b.id+" "+b.quantity+" "+b.name+" "+b.author+" "+b.publisher);
		}
		
		Iterator<Book> ltr = list.iterator();
		System.out.println("Modified content of list in backward is:");
		while(ltr.hasNext())
		{
			Book st = ltr.next();
			System.out.println(st.id+" "+st.quantity+" "+st.name+" "+st.author+" "+st.publisher);
		}
		
	}

}
