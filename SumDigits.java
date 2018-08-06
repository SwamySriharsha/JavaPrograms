import java.util.*;

class SumD{
	int quo,rem;
	static int sum;
     public void sumDigi(int myNum){
           rem = myNum%10;

           if(rem!=0){
            sum = sum+rem;
            quo = myNum/10;
            sumDigi(quo);
          }else{
          	System.out.println("Sum is "+sum);
          }
     }
}

class SumDigits{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Number: ");
		int num = sc.nextInt();
        
        SumD sd = new SumD();
        sd.sumDigi(num);

	}
}