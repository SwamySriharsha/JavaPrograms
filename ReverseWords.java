
class ReverseWords{

	public static void main(String[] args) {
		String myStr = "i love raudra and ravindra";
		doReverse(myStr);
	}

	public static void doReverse(String myStr){
		char[] carr = myStr.toCharArray();
		System.out.println(carr.length); //26
		int[] spaceArr = new int[10];
		int si = 0;

		for (int i=0; i<carr.length ;i++ ) {
			if(carr[i] == ' '){
				spaceArr[si] = i;
				si++;
			}
		}
		spaceArr[si] = carr.length;

		char[] narr = new char[carr.length];

		int n1,n2;
		int k=0;

		for(int j=si-1; j>=0; j--){

			n1 = spaceArr[j]+1;
			n2 = spaceArr[j+1]-1;
			System.out.println(n1+" "+n2);

			for(int l=n1; l<=n2; l++){
				narr[k] = carr[l];
				k++;
			}

			narr[k] = ' ';
			k++;
			
		}

		for(int m=0; m<spaceArr[0]; m++){
			narr[k] = carr[m];
			k++;
		}

		for(int i=0; i<narr.length; i++){
			System.out.print(narr[i]);
		}


	}

}