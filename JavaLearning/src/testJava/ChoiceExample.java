package testJava;

import java.awt.Choice;
import java.awt.Frame;

public class ChoiceExample 
{
	ChoiceExample()
	{
		Frame f = new Frame();
		Choice c= new Choice();
		
		c.setBounds(100,100,75,75);
		c.add("Jalgaon");
		c.add("Pune");
		c.add("Nagpur");
		f.add(c);
		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}
	public static void main(String args[])
	{
		new ChoiceExample();
	}
}
