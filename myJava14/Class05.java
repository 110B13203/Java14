package myJava14;
import java.io.*;
public class Class05 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\物件導向程式設計\\eclipse-workspace\\Java14\\src\\myJava14\\donkey.txt");
		char a[]=new char[128];
		int num=fr.read(a);
		String s=new String(a,9,num-9);
		System.out.println(s);
		System.out.println(num-9);
		fr.close();
	}

}
