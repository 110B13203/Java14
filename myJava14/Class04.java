package myJava14;
import java.io.*;
public class Class04 {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader("D:\\物件導向程式設計\\eclipse-workspace\\Java14\\src\\myJava14\\donkey.txt");
		char a[]=new char[128];
		int num=fr.read(a);
		String s=new String(a,0,num);
		System.out.println(s);
		System.out.println(num);//不一樣，每次換行都會有'\r''\n'兩個字元
		fr.close();
	}

}
