package myJava14;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public class Class03 {

	public static void main(String[] args) throws IOException
	{
		BufferedReader buf=new BufferedReader(new InputStreamReader(System.in));
		String num;
		num=buf.readLine();
		int n=Integer.parseInt(num);
		System.out.println((1+n)*n/2);
		buf.close();
	}

}
