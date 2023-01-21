/*
 * How to use indesOf() in java Program
 */
package testJava;

public class IndexOfExample 
{

	public static void main(String[] args) 
	{
		
		String myString = "hello";
		int index = myString.indexOf("ell");
		System.out.println("Index of 'ell': " + index);
		
		String s1 ="this is index of example";
		
		//passing substring
		int index1 = s1.indexOf("is");//returns the index of is substring
		int index2 = s1.indexOf("index");//returns the index of index substring
		
		System.out.println(index1+"  "+index2);
		
		//passing substring with from index 
		int index3 = s1.indexOf("is", 4);//returns the index of is substring after 4th index 
		System.out.println(index3);
		
		//passing char value
		int index4 = s1.indexOf('s');
		System.out.println(index4);
		

	}

}

/*
It is important to note that the indexOf() method returns -1 if the character or substring is not found in the string.
*/