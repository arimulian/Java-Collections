package armul.java.collection.coba;
import java.util.StringJoiner;

public class ReverseArrayApp {
	public static void main(String[] args) {


		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		reverseArray(arr);
	}


	public static void reverseArray(int[] arr){

		StringJoiner joiner = new StringJoiner(", ","[","]");
		int temp;
		int start = 0;
		int end = arr.length - 1;
		while (start < end){
			temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

		for(var value : arr){
			joiner.add(String.valueOf(value));
		}

		System.out.println(joiner);

	}
}
