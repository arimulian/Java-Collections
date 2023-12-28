package armul.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchApp {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();
		list.addAll(List.of("ari", "vania" , "pasya"));

//		Collections.sort(list);
		Collections.binarySearch(list,"vania");

		for (var value : list) {
			System.out.println(value);
		}
	}
}
