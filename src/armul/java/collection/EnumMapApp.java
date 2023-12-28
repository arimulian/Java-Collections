package armul.java.collection;

import java.util.EnumMap;
import java.util.Map;

public class EnumMapApp {
	public static enum Level{
	STANDART, PREMIUM, VIP
	}

	public static void main(String[] args) {

		Map<Level, String> map = new EnumMap<>(Level.class);

		map.put(Level.STANDART, "Ari");
		map.put(Level.PREMIUM, "vania");

		for (var key : map.entrySet()) {
			System.out.println(key);
		}


	}
}
