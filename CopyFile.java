import java.io.*;
import java.util.*;
public class CopyFile {
 public static void main(String[] args) throws Exception {
 Scanner sc = new Scanner(System.in);
 FileReader fin = new FileReader("writer.txt");
 FileWriter fout = new FileWriter("a1.txt");
 int c;
 while ((c = fin.read()) != -1) {
 fout.write(c); }
 System.out.println("copy finish!!");
 fin.close();
 fout.close();
 }
}
