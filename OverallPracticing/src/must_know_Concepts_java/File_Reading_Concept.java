package must_know_Concepts_java;

import java.io.BufferedReader;

import java.io.FileReader;
import java.io.IOException;

public class File_Reading_Concept {

	public static void main(String[] args) throws IOException {
		
		FileReader fileReader=new FileReader("FileOutputStream.txt");
		BufferedReader buffReader=new BufferedReader(fileReader);
		String lines;
		StringBuffer buffer=new StringBuffer();
		while((lines=buffReader.readLine())!=null)
		{
			buffer.append(lines);
		}
		System.out.println(buffer);
	buffReader.close();

	}

}
