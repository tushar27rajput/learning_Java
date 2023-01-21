package testJava;

import java.awt.Button;
import java.awt.Frame;

public class FirstAWTExample extends Frame
{
	FirstAWTExample()
	{
		Button b = new Button("Click Me !");
		// setting button position
		b.setBounds(30, 100, 80, 30);
		//adding button into frame
		add(b);
		//frame size 300 width and 300 height 
		setSize(300,300);
		//no layout manager 
		setLayout(null);
		//now frame will be visible, by default not visible
		setVisible(true);
		
	}
	
	public static void main(String args[])
	{
		new FirstAWTExample();
	}
}
