package testUtil;

import java.util.Map;
import java.util.TreeMap;

public class HashmapData {
	public static void main(String[] args) {
		
	
	
	TreeMap<Integer,TestData> map = new TreeMap<Integer,TestData>();
	map.put(1, new TestData(22,"smoke","verification"));
	map.put(33, new TestData(4,"sanity"," module"));
	map.put(4, new TestData(1,"UItest","erification"));
	
	for(Map.Entry<Integer,TestData>  entry:map.entrySet()){
		
		
		TestData e =entry.getValue();
		System.out.println(entry.getKey()+ "  "+e.testcase + " "+e.testname +" " + e.TestDes);
		
	}
	
	

	}

}
