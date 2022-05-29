package excelsReadsParent;
import java.io.FileWriter;
import java.io.IOException;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
public class CreatingJSONDocument {
   public static void createJson(List<Vegetables> list) 
   {
      //Creating a JSONObject object
      
      
      JSONArray array = new JSONArray();
      
      for(Vegetables v1:list)
      {
    	  JSONObject jsonObject = new JSONObject();
          //Inserting key-value pairs into the json object
          jsonObject.put("Vegetable", v1.name);
          jsonObject.put("import rate", v1.importRate);
          jsonObject.put("export rate", v1.exportRate);
    	  
          array.add(jsonObject);
      }
      
     
      try {
         FileWriter file = new FileWriter("output.json");
         file.write(array.toJSONString());
         file.close();
      } catch (IOException e) {
         // TODO Auto-generated catch block
         e.printStackTrace();
      }
     
      
   }
}