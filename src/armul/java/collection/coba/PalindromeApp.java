package armul.java.collection.coba;


public class PalindromeApp {


	public static void main(String[] args) {
		String word = "ari";
		System.out.println(checkPalindrome(word.toLowerCase()));
	}
	public static Boolean checkPalindrome(String word){
		StringBuilder temp = new StringBuilder();
		var answer = false;
		for (int i = word.length() - 1; i >= 0; i--) {
			temp.append(word.charAt(i));
		}
		if (word.contentEquals(temp)){
			answer= true;
		}
		return  answer;
	}
}
