package testUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class AlertHelper {
	
	 public static void main(String[] args)  
	    { 
	      
	        HashMap<String, Integer> map = new HashMap<>(); 
	          
	      map.put("Angita",10);
	      map.put("Angita",10);
	      map.put("test", 20);
	      map.put("test", 20);
	      map.put("test", 20);
	      map.put("teee",99);
	      System.out.println("map" + map);
	      
	      map.remove("teee");
	      System.out.println("map" + map);
	      
	      
//	      for(Map.Entry<String,Integer> m: map.entrySet())
//	      {
//	    	  System.out.println(m.getKey() +" :"+ m.getValue());
//	      }
	    }
	   
}
