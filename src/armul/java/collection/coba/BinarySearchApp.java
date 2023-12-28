package armul.java.collection.coba;

public class BinarySearchApp {

	public static int binarySearch(int[] value, int first, int last, int key){

		//[1,2,3,4,5,6,7,8,9,10] key -> 9
				//5 -> 6
		while (first <= last){
		int mid = (first + last) / 2;
			if(value[mid] == key){
				return mid;
			}else if(value[mid] > key){
				last = mid - 1;
			} else{
				first = mid + 1;
			}
		}
			return  - 1;
	}

	public static void main(String[] args) {

		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
		int last = arr.length - 1;

		var result = BinarySearchApp.binarySearch(arr,0,last,9);

		if (result == -1) {
			System.out.println("not found");
		}else{
			System.out.println("index at " + result);
		}
	}

}
