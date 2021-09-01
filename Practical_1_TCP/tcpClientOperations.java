
import java.net.*;
import java.io.*;
class tcpClientOperations
{
	public static void main(String args[])
	{
		try
		{
			Socket cs = new Socket("LocalHost",8001); 
			BufferedReader infu = new BufferedReader(new InputStreamReader(System.in));

			System.out.println("Enter a number : ");
			int num = Integer.parseInt(infu.readLine());
			

			DataOutputStream out = new DataOutputStream(cs.getOutputStream());
			out.writeInt(num);

			DataInputStream in = new DataInputStream(cs.getInputStream()); 
			System.out.println(in.readUTF()); 

			cs.close();
		}
		catch(Exception e)
		{
		System.out.println(e.toString());
		}
	}
}

