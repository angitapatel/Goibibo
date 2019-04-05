package testUtil;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DuplicateHashmap {
	Map<String, Integer> map;
	public void dupchek(String s1) {
		Map<String, Integer> map = new HashMap<String, Integer>();

		String[] str = s1.split(" ");
		for (String s : str) {
			if (map.get(s) != null) {
				map.put(s, map.get(s) + 1);
			} else {
				map.put(s, 1);
			}

		}
		
		System.out.println(map);
	
	Set<String> set = 	map.keySet();
	
	for(String s2: set)
	{
		if(map.get(s2)>1)
		{
			System.out.println(s2 + " " + map.get(s2));
		}
		
	}
	}
	
	

	public static void main(String[] args) {
		DuplicateHashmap s1 = new DuplicateHashmap();
		s1.dupchek("JAVA is the My JAVA is new language for the test");

	}

}
