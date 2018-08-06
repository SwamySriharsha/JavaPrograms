import java.util.*;
class LargeAmong{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.printf("Scan three numbers: ");
		int n1 = sc.nextInt();
		int n2 = sc.nextInt();
		int n3 = sc.nextInt();

		if(n1>n2){
			if(n1>n3){
				System.out.println("The largest num is "+n1);
			}else if(n3>n1){
                if(n3>n2){
                 System.out.println("The largest num is "+n3);
                }
			}
		}else if(n2>n1){
           if(n2>n3){
              System.out.println("The largest num is "+n2);
           }else if(n3>n2){
              System.out.println("The largest num is "+n3);

           }
		}
	}
}