/* Write a java program to remove characters
 from the first string which are present in the second string?*/

<<<<<<< HEAD
import java.util.Scanner;
=======
>>>>>>> 791e12115ea9e0fc46465a0b6b72eb541c291e2d

class RemoveS2Chars{

	public static void main(String[] args) {
<<<<<<< HEAD
		Scanner sc = new Scanner(System.in);
		StringBuilder s1 = new StringBuilder(sc.nextLine());
		StringBuilder s2 = new StringBuilder(sc.nextLine());
=======
		StringBuilder s1 = new StringBuilder("harsha");
		StringBuilder s2 = new StringBuilder("rushi");
>>>>>>> 791e12115ea9e0fc46465a0b6b72eb541c291e2d
		System.out.println(s1+" "+s2);
		calChars(s1,s2);
	}

	public static void calChars(StringBuilder s1, StringBuilder s2){
		for(int i=0; i<s2.length(); i++){
			char c = s2.charAt(i);
			for(int j=0; j<s1.length(); j++){
				if(s1.charAt(j) == c){
					remove(s1,j);
				}
			}
		}
		System.out.println("After calChars "+s1);
	}

	public static void remove(StringBuilder s1, int j){
		for(int k=j; k<s1.length()-1; k++){
			char c = s1.charAt(k+1);
			s1.setCharAt(k, c);
		}
		s1.setCharAt(s1.length()-1, '\0');
	}
	
}

