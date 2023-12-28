package armul.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Spliterator;

public class SpiliteratorApp {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>();
		for (int i = 1; i <= 1000; i++) {
			list.add(i);
		}

		System.out.println(list.size());
		Spliterator<Integer> spliterator = list.spliterator();
		Spliterator<Integer> spliterator2 = spliterator.trySplit();

		System.out.println(spliterator2.estimateSize());

		spliterator2.forEachRemaining(value -> System.out.println(value));
		spliterator.forEachRemaining(value -> System.out.println(value));
	}
}
