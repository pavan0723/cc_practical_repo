
/* Program to implement  chat server */

import java.net.*;
import java.io.*;
class Chatserver
{
public static void main(String args[])
{
try
{
ServerSocket ss = new ServerSocket(8000);
System.out.println("Waiting for client to connect.."); 
Socket s = ss.accept();
BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
DataOutputStream out = new DataOutputStream(s.getOutputStream()); 
BufferedReader in = new BufferedReader(new InputStreamReader(s.getInputStream()));
String receive, send;
while((receive = in.readLine()) != null)
{
if(receive.equals("STOP"))
break;
System.out.println("Client Says : "+receive);
System.out.print("Server Says : ");
send = br.readLine();
out.writeBytes(send+"\n");
}
br.close();
in.close();
out.close();
s.close();
}
catch(Exception e)
{
e.printStackTrace();
}
}
}


