package armul.java.collection;

import java.util.ArrayDeque;
import java.util.Queue;

public class QueueApp {
	public static void main(String[] args) {

		Queue<String> names = new ArrayDeque<>();

		names.add("Ari");
		names.add("mulian");
		names.add("b");

		for (String name = names.poll(); name != null; name = names.poll()) {
			System.out.println(name);
		}

		System.out.println(names.size());
	}
}


