import java.util.*;
class PalindromeCheck{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter Number: ");
		int num = sc.nextInt();
		int sum=0;

		
		if(isPalindrome(num)){

			System.out.println("It is a palindrome");
		}
		else{
			System.out.println("It is not a palindrome");
		}


	}
   

	private static int getCheck(int num, int sum){
		 int rem;
         int quo;
         

       if(num!=0){
		 rem = num%10;
         quo = num/10;
         sum = (sum*10) + rem;
         return getCheck(quo,sum); //recursion
       }
       else{
       	 return sum;
       }
       

       
	}

	public static boolean isPalindrome(int num){
        
        int sum=getCheck(num,0);
        if(sum==num){
        	return true;
        }else{
        	return false;
        }
	}
}

//bruce eckel thinking in java