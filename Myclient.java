import java.io.*; 
import java.net.*; 
import java.util.Scanner; 
public class Myclient
 { 
public static void main(String[] args) throws Exception 
{
 int number, temp;
 Scanner sc = new Scanner(System.in); 
Socket s = new Socket("localhost", 8087); 
Scanner sc1 = new Scanner(s.getInputStream()); System.out.println("Enter any number"); 
number = sc.nextInt(); 
PrintStream p = new PrintStream(s.getOutputStream()); 
p.println(number); temp = sc1.nextInt(); 
System.out.println(temp); 
} 
}

