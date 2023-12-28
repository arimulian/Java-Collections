package armul.java.collection;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class EntryMapApp {
	public static void main(String[] args) {

		Map<String,String> map = new HashMap<>();

		map.put("name", "ari");
		map.put("location", "karawang");

		Set<Map.Entry<String,String>>entries = map.entrySet();
		for (var entry : entries) {
			System.out.println(entry.getKey() + "=" + entry.getValue());
		}
	}
}
