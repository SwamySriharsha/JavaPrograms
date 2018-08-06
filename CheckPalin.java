
import java.util.Scanner;
class CheckPalin{
	public static void main(String[] args) {
		String word;
		Scanner sc = new Scanner(System.in);
		word = sc.next();
		CheckWord(word);
	}
	public static void CheckWord(String word){
		int i = 0;
		int j = word.length()-1;
		while(i <= j){
			if(word.charAt(i) != word.charAt(j)){
				System.out.println("Not a Palindrome");
				return;
			}
			i++;
			j--;
		}
		System.out.println("Palindrome");
	}
}