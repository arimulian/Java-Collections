package armul.java.collection;

import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

public class NavigableSetApp {
	public static void main(String[] args) {

		NavigableSet<String> names = new TreeSet<>();
		names.addAll(Set.of("ari", "muliansyah", "manurung", "vania", "pasya"));


		for (String name : names){
			System.out.println(name);
		}
	}
}
