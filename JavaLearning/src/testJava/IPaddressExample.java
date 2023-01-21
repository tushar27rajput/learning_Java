package testJava;

import java.net.InetAddress;
import java.net.UnknownHostException;

public class IPaddressExample 
{
	
	public static void main(String[] args) throws UnknownHostException 
	{
		InetAddress ip = InetAddress.getByName("www.google.com");
		
		String hostname = ip.getHostName();
		System.out.println("Hostname: " +hostname);
		
		String ipaddress = ip.getHostAddress();
		System.out.println("IP address: " +ipaddress);

	}

}
