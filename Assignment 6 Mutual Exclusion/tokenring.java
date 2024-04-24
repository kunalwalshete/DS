import java.util.*;
class tokenring {
 public static void main(String args[]) throws Throwable {
 Scanner scan = new Scanner(System.in);
 System.out.println("Enter no of Nodes:");
 int n = scan.nextInt();
 int m = n - 1;
 int token = 0; 
 int ch = 0, flag = 0;
 for (int i = 0; i < n; i++) {
 System.out.print("" + i);
 }
 System.out.println("" + 0);
 do {
 System.out.println("Enter sender:");
 int s = scan.nextInt();
 System.out.println("Enter receiver:");
 int r = scan.nextInt();
 System.out.println("Enter Data:");
 int a;
 a = scan.nextInt();
 System.out.print("Token Passing");
 for (int i = token, j = token; (i % n) != s; i++, j = (j + 1) % n) {
 System.out.print("" + j + "->");
 }
 System.out.println("" + s);
 System.out.println("Sender" + s + "Sending Data:" + a);
 for (int i = s + 1; i != r; i = (i + 1) % n) {
 System.out.println("Data" + a + "Forwarded By:" + i);
 }
 System.out.println("Receiver" + r + "Received Data:" + a + "\n");
 token = s;
 do {
 try {
 if (flag == 1)
 System.out.print("Invalid Input!!...");
 System.out.print("Do you want to send again?? Enter 1 for yes and 0 for No:");
 ch = scan.nextInt();
 if (ch != 1 && ch != 0)
 flag = 1;
 else
 flag = 0;
 } catch (InputMismatchException e) {
 System.out.println("Invalid Input");
 }
 } while (ch != 1 && ch != 0);
 } while (ch == 1);
 }
}
