package armul.java.collection;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class ImmutableSetApp {
	public static void main(String[] args) {

		Set<String> empty = Collections.emptySet();
		empty.add("hello"); // Error

		Set<String> single = Collections.singleton("one");
		single.add("two"); // Error

		// Mutable
		Set<String> mutable = new HashSet<>();
		mutable.add("three");
		mutable.add("four");
		// diubah menjadi immutable
		Set<String> immutable = Collections.unmodifiableSet(mutable);

		Set<String> names = Set.of("ari", "mulian");
		names.add("manurung"); // Error
		names.remove("ari"); // Error

	}
}
