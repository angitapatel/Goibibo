package testUtil;

import java.util.HashMap;
import java.util.Map;

public class HashmapCustomer {
	public static void main(String[] args) {
		
	
	HashMap<Integer,Customer> map = new HashMap<Integer,Customer>();
	map.put(1,new Customer("test1",10,30,"rectange"));
	map.put(2,new Customer("asd",30,20,"trinagle"));
	map.put(3,new Customer("ree",40,50,"Square"));
	map.put(3,new Customer("ree",3,5,"Square"));
	//System.out.println(map.keySet());
	
	for(Map.Entry<Integer,Customer> entry : map.entrySet())
	{
		Customer c =entry.getValue();
		
	System.out.println((entry.getKey()+"  : "+c.age+"  :"+c.name+"  :"+c.area+" "+c.money));


	}
	}
}