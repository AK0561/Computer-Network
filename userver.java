import java.io.*;
import java.net.*;
class userver
{
public static void main(String args[]) throws IOException
{
try (DatagramSocket ds = new DatagramSocket(3000)) {
    BufferedReader bin=new BufferedReader(new InputStreamReader(System.in));
    String s="";
    System.out.println("Enter '$' to stop chat");
    while(s.equals("$")!=true)
    {
    byte b1[]=new byte[50];
    DatagramPacket rp=new DatagramPacket(b1,50);
    ds.receive(rp);
    System.out.print("client:");
    System.out.println(new String(rp.getData()));
    s=bin.readLine();
    byte b[]=s.getBytes();
    DatagramPacket sp=new DatagramPacket(b,b.length,rp.getAddress(),rp.getPort());
    ds.send(sp);
    }
}
}
}









































