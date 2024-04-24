import java.io.*;
import java.net.*;
public class Server { 
 public static void main(String[] args) { 
 try { 
 ServerSocket serverSocket = new ServerSocket(1234);
 System.out.println("Server started and listening on port 1234");
 while (true) { 
 Socket clienSocket = serverSocket.accept();
 System.out.println("Client connected : 0 " + 
clienSocket.getInetAddress().getHostAddress());
 Thread t = new Thread(new ClientHandler(clienSocket));
 t.start();
 } 
 } catch (IOException e) { 
 e.printStackTrace();
 } 
 } 
} 
class ClientHandler implements Runnable { 
 private Socket clientSocket;
 public ClientHandler(Socket socket) { 
 this.clientSocket = socket;
 } 
 @Override 
 public void run() { 
 try { 
 PrintWriter out = new PrintWriter(clientSocket.getOutputStream(), true);
 BufferedReader in = new BufferedReader(new 
InputStreamReader(clientSocket.getInputStream()));
 out.println(System.currentTimeMillis());
 in.close();
 out.close();
 clientSocket.close();
 } catch (IOException e) { 
 e.printStackTrace();
 } 
 } 
} 

