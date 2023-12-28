package armul.java.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class DequeApp {
	public static void main(String[] args) {

		/**
		 * Stack -> LIFO ( Last in First out )
		 */
		Deque<String> stack = new ArrayDeque<>();
		stack.addLast("ari");
		stack.addLast("muliansyah");
		stack.addLast("manurung");

		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());
		System.out.println(stack.pollLast());

		/**
		 * Queue -> FIFO ( First in First out )
		 */
		Deque<String> queue = new ArrayDeque<>();
		stack.addLast("ari");
		stack.addLast("muliansyah");
		stack.addLast("manurung");

		System.out.println(stack.pollFirst());
		System.out.println(stack.pollFirst());
		System.out.println(stack.pollFirst());



	}
}
