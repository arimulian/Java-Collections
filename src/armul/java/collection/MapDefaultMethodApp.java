package armul.java.collection;

import java.util.HashMap;
import java.util.Map;

public class MapDefaultMethodApp {
	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("001", "ari");
		map.put("002", "vania");
		map.put("003", "pasya");

		map.forEach((key, value) -> System.out.println(key + "=" + value));

	}
}

