package vcanus;

import java.io.FileReader;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class FactoryMethod {
	
	//bread 按眉 蒲配府皋家靛 积己 
	//JSON 颇教 
	//override..???

	public static void main(String[] args) throws ParseException {

		JSONParser parser = new JSONParser();

		try {
//			FileReader reader = new FileReader("https://drive.google.com/file/d/1CPt0YMDN6mOZR9NlwDZ-NdgCOZSGNiiM/view");
			FileReader reader = new FileReader("C:\\Temp\\vcanus\\bread.json");
			Object obj = parser.parse(reader);
			JSONObject jsonObject = (JSONObject) obj;
			JSONArray breadArray = (JSONArray) jsonObject.get("bread");


			for (int i = 0; i < breadArray.size(); i++) {
				
				JSONObject breadObject = (JSONObject) breadArray.get(i);
				System.out.println(breadObject.get("breadType"));
				System.out.println(breadObject.get("recipe"));

			}
			
			reader.close();
			
			System.out.print(jsonObject);
			
		} catch (IOException | ParseException e) {
			e.printStackTrace();
		}
		
	}

}
