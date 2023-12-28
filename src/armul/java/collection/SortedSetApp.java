package armul.java.collection;

import armul.java.collection.data.Person;
import armul.java.collection.data.PersonComparator;

import java.util.Collections;
import java.util.SortedSet;
import java.util.TreeSet;

public class SortedSetApp {
	public static void main(String[] args) {

		SortedSet<Person> names = new TreeSet<>(new PersonComparator());
		names.add(new Person("ari"));
		names.add(new Person("muliasnyah"));
		names.add(new Person("manurung"));

		for (var name : names) {
			System.out.println(name.getName());
		}

		// Immutable
		SortedSet<Person> immutable = Collections.unmodifiableSortedSet(names);
		SortedSet<Person> empty = Collections.emptySortedSet();
	}
}
