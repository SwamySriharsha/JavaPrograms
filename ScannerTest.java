import java.util.*;
class ScannerTest{
	public static void main(String[] args) {
		Scanner sn = new Scanner(System.in);
		System.out.println("Enter value A");
		int a = sn.nextInt();
		System.out.println("Enter value B");
		int b = sn.nextInt();
		System.out.println("The sum is "+ (a+b));
	}
}