import java.util.*;

class Conversion{ 
	double fahren;
     public void convert(double d){
          fahren = (9 / 5) * d + 32;
          System.out.println("Fahrenheit value is "+fahren);
     }
}

class TempConversion{
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("Enter celcius value: ");
		double celcius = sc.nextDouble();

        Conversion co = new Conversion();
        co.convert(celcius);
	}
}