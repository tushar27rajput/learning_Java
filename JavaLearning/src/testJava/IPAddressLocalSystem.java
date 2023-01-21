package testJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPAddressLocalSystem 
{

	public static void main(String[] args) throws UnknownHostException 
	{
		System.out.println(InetAddress.getLocalHost());

	}

}
