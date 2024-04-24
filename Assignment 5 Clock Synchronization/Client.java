import java.io.*;
import java.net.*;
public class Client { 
 public static void main(String[] args) { 
 try { 
 Socket socket = new Socket("localhost", 1234);
 BufferedReader in = new BufferedReader(new 
InputStreamReader(socket.getInputStream()));
 PrintWriter out = new PrintWriter(socket.getOutputStream(), true);
 float serverTime = Float.parseFloat(in.readLine());
 float clientTime = System.currentTimeMillis();
 float timeDifference = serverTime - clientTime;
 System.out.println("Server TIme : " + serverTime);
 System.out.println("Client time : " + clientTime);
 System.out.println("Time Difference : " + timeDifference);
 in.close();
 out.close();
 socket.close();
 } catch (IOException e) { 
 e.printStackTrace();
 } 
 } 
} 
