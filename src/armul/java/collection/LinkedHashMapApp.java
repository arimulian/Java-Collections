package armul.java.collection;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapApp {
	public static void main(String[] args) {

		Map<String,String> map = new LinkedHashMap<>();

		map.put("first", "ari");
		map.put("last", "mulian");

		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}
}
