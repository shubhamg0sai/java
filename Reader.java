import java.io.FileReader;
public class Reader {
 public static void main(String[] args) throws Exception {
 FileReader fr=new FileReader("writer.txt");
 int i;
 while((i=fr.read()) != -1){
 System.out.println((char)i);
 }
 fr.close();
 }
}
