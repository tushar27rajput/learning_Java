package testJava;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexExample1 
{

	public static void main(String[] args) 
	{
		String input = "Hello, world!";
        String regex = "^H.*d!$"; // starts with H, ends with d!

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) 
        {
            System.out.println("The input matches the regular expression.");
        } 
        else 
        {
            System.out.println("The input does not match the regular expression.");
        }

	}

}

/**
In Java, you can use the java.util.regex package to work with regular expressions. 
The Pattern class in this package represents a compiled regular expression, and 
the Matcher class can be used to match the pattern against a string.
Here's an example of how to check if a string matches a regular expression in Java:
*/