package armul.java.collection;

import java.util.ArrayList;
import java.util.List;

public class ListApp {
	public static void main(String[] args) {

		List<String> products = new ArrayList<>();

		products.add("pakaian");
		products.add("makanan");
		products.addAll(List.of("minuman", "Electronic"));

		products.remove("Electronic");

		for (String product : products) {
			System.out.println(product);
		}

	}
}
