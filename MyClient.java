import java.io.*;  
import java.net.*;  
public class MyClient {  
public static void main(String[] args) {  
try{      
Socket s=new Socket("localhost", 22800);  
DataOutputStream dout=new DataOutputStream(s.getOutputStream());  
dout.writeUTF("Hello ram");
DataInputStream di  = new DataInputStream(s.getInputStream());
System.out.println(di.readUTF());  
dout.flush();  
dout.close();  
s.close();  
}catch(Exception e){System.out.println(e);}  
}  
}  
