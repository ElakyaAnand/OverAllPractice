package must_know_Concepts_java;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class Buffered_File_Writing_Operations {

	public static void main(String[] args) throws IOException {
		
		
		String content="Keep Learning.. Slow and Steady Wins the Race";
		String filepath="FileWriterBuffer.txt";
		
		
		FileWriter file=new FileWriter(filepath);
		BufferedWriter bWriter=new BufferedWriter(file);
		bWriter.write(content);
		bWriter.close();

	}

}
