package armul.java.collection;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class ListDefaultMethodApp {
	public static void main(String[] args) {

		List<Integer> list = new ArrayList<>(1000);
		for (int i = 1; i <= 1000; i++) {
			list.add(i);
		}
		
//		list.forEach(new Consumer<Integer>() {
//			@Override
//			public void accept(Integer integer) {
//				System.out.println(integer);
//			}
//		});

		list.forEach(integer -> System.out.println(integer));

		list.replaceAll(integer -> {
			if(integer % 2 == 0){
				return integer;
			}
			return 0;
		});
		System.out.println(list);
	}
}
