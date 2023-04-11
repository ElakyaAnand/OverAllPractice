package must_know_Concepts_java;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class Json_Read_Concept {

	public static void main(String[] args) throws IOException, ParseException {
		
		
		FileReader filepath=new FileReader("Jsonfile.json");
		
		JSONParser jsonparser=new JSONParser();
		Object parsedobject= jsonparser.parse(filepath);
		
		JSONObject jsonobject=(JSONObject) parsedobject;
		
		String name= (String) jsonobject.get("Name");
		Long id=(Long) jsonobject.get("ID");
		
		System.out.println("The Name is:" + name);
		System.out.println("The ID is :" + id);
		
		JSONArray jsonarrArray= (JSONArray) jsonobject.get("Qualities");
		
		Iterator iterator= jsonarrArray.iterator();
		
		while(iterator.hasNext())
		{
			System.out.println("The Qualitites are: "+iterator.next());
		}

	}

}
