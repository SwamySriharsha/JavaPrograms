import java.util.*;

class MinuteConversion{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Minutes: ");
		int min = sc.nextInt();

		convert(min);
	}

	public static void convert(int minIn){
		
		float hours = (minIn/60);
		float days = (hours/24);
		float years = (days/365);

		System.out.println(days+" days ### "+years+" Years");

	}
}