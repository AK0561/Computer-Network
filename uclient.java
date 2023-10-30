import java.io.*;
import java.net.*;
class uclient
{
public static void main(String args[]) throws IOException
{
InetAddress lh=InetAddress.getByName("127.0.0.1");
try (DatagramSocket ds = new DatagramSocket()) {
    String s="";
    System.out.println("Enter '$' to stop chat");
    BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
    while(s.equals("$")!=true)
    {
    byte b1[]=new byte[50];
    s=bin.readLine();
    byte b[]=s.getBytes();
    DatagramPacket sp=new DatagramPacket(b,b.length,lh,3000);
    ds.send(sp);
    if(s.equals("$")!=true)
    {
    DatagramPacket rp=new DatagramPacket(b1,50);
    ds.receive(rp);
    System.out.print("server:");
    System.out.println(new String(rp.getData()));
    }
    }
}
}
}









































