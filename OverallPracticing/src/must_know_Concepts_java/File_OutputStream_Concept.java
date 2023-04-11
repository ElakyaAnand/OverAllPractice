package must_know_Concepts_java;


import java.io.FileOutputStream;
import java.io.IOException;

public class File_OutputStream_Concept {

	public static void main(String[] args) throws IOException {
		
		String content="Keep Learning.. Slow and Steady Wins the Race... Keep Practice";
		String filepath="FileOutputStream.txt";
		
		
		FileOutputStream fileouStream=new FileOutputStream(filepath);
		byte[] bytecontent= content.getBytes();
		fileouStream.write(bytecontent);
		fileouStream.close();
	}

}
