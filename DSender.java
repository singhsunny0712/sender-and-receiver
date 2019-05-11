//DSender.java  
import java.net.*;  
import java.util.Scanner;
public class DSender{  
  public static void main(String[] args) throws Exception {  
    DatagramSocket ds = new DatagramSocket();  
	Scanner sc=new Scanner(System.in);
	String str1=sc.nextLine();
    String str = "Welcome java";  
    InetAddress ip = InetAddress.getByName("127.0.0.1");  
     
    DatagramPacket dp = new DatagramPacket(str1.getBytes(), str1.length(), ip, 3000);  
    ds.send(dp);  
    ds.close();  
  }  
}