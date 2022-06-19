import java.io.*;
 import java.net.*; 
import java.util.Scanner;
 public class Myserver 
{
 public static void main(String[] args) throws Exception
 { 
int number,temp;
 ServerSocket s1=new ServerSocket(8087);
 Socket ss=s1.accept(); 
Scanner sc=new Scanner(ss.getInputStream()); 
number=sc.nextInt(); 
temp=2*number; 
PrintStream p=new PrintStream(ss.getOutputStream()); 
p.println(temp);
 }
 }

