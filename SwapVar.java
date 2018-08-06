import java.util.*;
class SwapVar{
	public static void main(String[] args) {
		// without using third variable
		int a=30,b=40;
		System.out.println("Before Swapping "+a+" "+b );

		a=a+b; //70
		b=a-b; //30
		a=a-b; //40
		System.out.println("After Swapping "+a+" "+b );
	}
}