package myJava14;
import java.io.*;

public class Class07 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\物件導向程式設計\\eclipse-workspace\\Java14\\src\\myJava14\\donkey.txt");
		BufferedReader buf=new BufferedReader(fr);
		System.out.println(buf.readLine());
		System.out.println(buf.readLine());
		buf.close();
	}

}
