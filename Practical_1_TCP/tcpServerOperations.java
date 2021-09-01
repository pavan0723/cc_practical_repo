
import java.net.*;
import java.io.*;
import java.util.*;
class tcpServerOperations
{
	public static void main(String args[])
	{
		try
		{
			ServerSocket ss = new ServerSocket(8001);
			System.out.println("Server Started...............");

			Socket s = ss.accept();
			DataInputStream in = new DataInputStream(s.getInputStream()); 

			int x= in.readInt();
			DataOutputStream otc = new DataOutputStream(s.getOutputStream()); 

			//Square
			System.out.println("Square of " + x + " is: " + Math.pow(x, 2));
			
			//Square Root
			System.out.println("Square Root of " + x + " is: " + Math.sqrt(x));
			
			//Cube
			System.out.println("Cube of " + x + " is: " + Math.pow(x, 3));
			
			//Cube root
			System.out.println("Cube root of "+ x +" is: "+Math.cbrt(x));
			
		}
		catch(Exception e)
		{
			System.out.println(e.toString());
		}
	}
}

