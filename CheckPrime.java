import java.util.*;
class CheckPrime{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a Number: ");
		int num = sc.nextInt();

		checkNum(num);

	}

	public static void checkNum(int num){
		int count=0;
		for(int i=1;i<=num;i++){
			if((num%i)==0){
				count++;
			}
		}

		if(count==2){
			System.out.println("It's a prime number");
		}else{
			System.out.println("It's NOT prime");
		}
	}
}