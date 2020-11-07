package learn.automation;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;



public class StringSpaceCount {

	public static void main(String[] args) throws IOException {
		FileReader fr=new FileReader(System.getProperty("user.dir")+"\\textFile\\input.txt");
		BufferedReader br=new BufferedReader(fr);
		String str=br.readLine();
		int count=process(str);
		System.out.println(count);
		PrintWriter out=new PrintWriter(System.getProperty("user.dir")+"\\textFile\\output.txt");
		out.println(count);
		out.close();
	}

	public static int process(String str){
		int count=0;
		for(int i=0;i<=str.length()-1;i++){
			if(str.charAt(i)==' '&& str.charAt(i+1)!=' '){
				count++;
			}
		}
		return count;
	}
}
