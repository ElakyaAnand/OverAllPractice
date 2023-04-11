package must_know_Concepts_java;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Json_Write_Example {

	public static void main(String[] args) throws IOException {
		
		
		JSONObject jsonObject=new JSONObject();
		
		jsonObject.put("Name", "Dayalan");
		jsonObject.put("ID", 01);
		
		
		JSONArray jsonArray=new JSONArray();
		jsonArray.add("Happy");
		jsonArray.add("Healthy");
		
		jsonObject.put("Qualities", jsonArray);
		
		FileWriter file=new FileWriter("Jsonfile.json");
		file.write(jsonObject.toJSONString());
		file.close();
		
	}

}
