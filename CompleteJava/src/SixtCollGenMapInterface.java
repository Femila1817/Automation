import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class SixtCollGenMapInterface {

	public static void main(String[] args) {
		
		Map<String,String>map = new HashMap<>();//Map<Key,Value> //this is one way of mapping..
	//	Map<String,String>map = new Hashtable<>();	//second way of mapping,
		map.put("myName", "Femila");
		map.put("aim","IAS");
		map.put("now", "SwitchJob");//what if we add a value 
		map.put("now", "Studying");  //replace the original value
		
		System.out.println(map);
		//prints all at one line..
		
		System.out.println(map.get("myName")); //to get individual value through keys
		//if we change key, we ll get the respective value
		
		Set<String> keys = map.keySet(); //store the key value
 		for(String key : keys) {
 			System.out.println(key + " " + map.get(key));
			
		}
 		
	
		//diff b/w hashm and hasht -> hasht - synchronized, hashm - not synchronized
		
		
	}
}
