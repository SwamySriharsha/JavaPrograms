import java.util.*;

class TableCalc{
	   int poww(int i,int a){
         int ni=i;
	   	if(a==1){
              return i;
	   	}else{
	   		for(int p=2;p<=a;p++){
               ni=ni*i;
	   	    }
	   	 return ni;
	   	}
	   	 
	   }
}

class TableMain{
	public static void main(String[] args) {

		TableCalc tc = new TableCalc();

		System.out.println("a \t a^2 \t a^3");
		
		for(int i=1;i<=4;i++){

		   for(int a=1;a<=3;a++){

            System.out.print(tc.poww(i,a)+"\t");

		   }

		   System.out.print("\n");

	   }

	   

	}
}