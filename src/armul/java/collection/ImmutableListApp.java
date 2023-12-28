package armul.java.collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ImmutableListApp {
	public static void main(String[] args) {

		List<Integer> list = Collections.emptyList();
		list.add(1); // error unsupported operation

		List<Integer> list2 = Collections.singletonList(1);
		list2.add(2); // error unsupported operation

		// MutableList<Integer>
		List<Integer> list3 = new ArrayList<>();
		list3.add(3);
		list3.add(4);
		// diubah menjadi immutableList
		List<Integer> immu = Collections.unmodifiableList(list3);
		immu.add(5); // error unsupported operation

		List<Integer> list4 = List.of(1, 2, 3, 4);
		list4.add(5); // error unsupported operation

	}
}
