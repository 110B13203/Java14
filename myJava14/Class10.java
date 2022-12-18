package myJava14;
import java.io.*;
import java.util.Arrays;
public class Class10 {

	public static void main(String[] args) throws IOException {
		int sum=0;
		FileWriter fw1=new FileWriter("D:\\物件導向程式設計\\eclipse-workspace\\Java14\\src\\myJava14\\rand.txt");
		BufferedWriter bufw=new BufferedWriter(fw1); 
		for(int i=1;i<=1000;i++) {
			double n=Math.random();
			bufw.write(Integer.toString((int)(n*100000)));
			bufw.newLine();
		}
		bufw.flush();
		bufw.close();
		FileReader fr=new FileReader("D:\\\\物件導向程式設計\\\\eclipse-workspace\\\\Java14\\\\src\\\\myJava14\\\\rand.txt");
		BufferedReader bufr=new BufferedReader(fr);
		int num[]=new int[1000];
		for(int i=0;i<=999;i++) {
			num[i]=Integer.parseInt(bufr.readLine());
		}
		bufr.close();
		Arrays.sort(num);
		for(int i=0;i<=999;i++) {
			sum+=num[i];
		}
		System.out.println("最小:"+num[0]);
		System.out.println("最大:"+num[999]);
		System.out.println("平均值:"+(double)(sum/1000));
		FileWriter fw2=new FileWriter("D:\\物件導向程式設計\\eclipse-workspace\\Java14\\src\\myJava14\\rand2.txt");
		BufferedWriter bufw2=new BufferedWriter(fw2);
		for(int i=0;i<=999;i++) {
			bufw2.write(Integer.toString(num[i]));
			bufw2.newLine();
		}
		bufw2.close();
	}

}
