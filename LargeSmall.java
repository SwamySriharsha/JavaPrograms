
import java.util.*;

class FindLS{
	private int[] arr;
	private int size;

	FindLS(int size){
		this.size = size;
		arr = new int[size];
	}

	public void setArr(){
		Scanner sc = new Scanner(System.in);
		for(int i=0; i<size; i++){
			arr[i] = sc.nextInt();
		}
	}

	public void printArr(){
		for(int i=0; i<size; i++){
			System.out.println(arr[i]);
		}
	}

	public void findMaxMin(){
		int max,min;
		max = min = arr[0];
		for(int i=1; i<size; i++){
			if(arr[i]<min){
				min = arr[i];
			}
			if(arr[i]>max){
				max = arr[i];
			}
		}
		System.out.println("Max = "+max+" Min = "+min);
	}
}

class LargeSmall{
	public static void main(String[] args) {
		FindLS ob = new FindLS(5);
		ob.setArr();
		ob.printArr();
		ob.findMaxMin();
	}
}