package armul.java.collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

public class SetApp {
	public static void main(String[] args) {

//		Set<String> names = new HashSet<>();
		Set<String> names = new LinkedHashSet<>();
		names.add("Ari");
		names.add("mulian");
		names.add("Ari");
		names.add("mulian");

		for (String name : names) {
			System.out.println(name);
		}
	}
}
