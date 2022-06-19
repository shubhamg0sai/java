import java.io.FileWriter;
public class Writer {
 public static void main(String[] args) {
 try{
 FileWriter fw=new FileWriter("writer.txt");
 fw.write("my name is shubham";
 fw.close();
 } catch(Exception e){
 System.out.println(e);
 }
 System.out.println("Success!!");
 }
 }
