package armul.java.collection;

import java.util.Comparator;
import java.util.SortedMap;
import java.util.TreeMap;

public class SortedMapApp {
	public static void main(String[] args) {

		Comparator<String> comparator = new Comparator<>(){

			@Override
			public int compare(String o1, String o2) {
				return o2.compareTo(o1);
			}
		};

		SortedMap<String, String> map = new TreeMap<>(comparator);

		map.put("middle", "Muliansyah");
		map.put("first", "Ari");
		map.put("last", "Manurung");

		for (String key : map.keySet()) {
			System.out.println(key + "=" + map.get(key));
		}
	}
}
