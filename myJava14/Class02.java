package myJava14;
import java.io.*;
public class Class02 {

	public static void main(String[] args) throws IOException {
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String s;
		s=buf.readLine();
		System.out.println(s.toUpperCase());
		buf.close();
	}

}
