package armul.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CollectionsApp {
	public static void main(String[] args) {

		List<String> list = new ArrayList<>();

		list.addAll(List.of("ari", "muliansyah", "manurung"));

		Collections.reverse(list);
		System.out.println(list);

		Collections.shuffle(list);
		System.out.println(list);
	}
}
