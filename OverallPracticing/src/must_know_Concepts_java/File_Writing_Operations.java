package must_know_Concepts_java;

import java.io.FileWriter;
import java.io.IOException;

public class File_Writing_Operations {

	public static void main(String[] args) throws IOException {
		
		String content="Keep Learning.. ";
		String filepath="FileWriter.txt";
		
		FileWriter file=new FileWriter(filepath);
		file.write(content);
		file.close();

	}

}
