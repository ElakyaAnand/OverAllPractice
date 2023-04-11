package must_know_Concepts_java;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class File_Paths_Concept {

	public static void main(String[] args) throws IOException {
		
		
		String content="Keep Learning.. Slow and Steady Wins the Race... Keep Practice";
		String filepath="Filepaths.txt";
		
		Path path= Paths.get(filepath);
		Files.write(path, content.getBytes());
		
	}

}
