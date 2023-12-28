package armul.java.collection;

import java.util.List;

public class IterableApp {
	public static void main(String[] args) {

		Iterable<String> Products = List.of("Pakaian", "Makanan", "minuman");

		for (var product : Products) {
			System.out.println(product);
		}
	}

}
