package armul.java.collection;

import java.util.Arrays;
import java.util.List;


public class ArrayApp {
	public static void main(String[] args) {

		List<String> list = List.of("hello","ari", "world");

		Object[] array = list.toArray();
		String[] stringArray = list.toArray(new String[]{});

		System.out.println(Arrays.toString(array));
		System.out.println(Arrays.toString(stringArray));
	}
}
