import java.lang.Math;
class Triangle{
	double s1,s2,s3;
	Triangle(double s1, double s2, double s3){
		this.s1 = s1;
		this.s2 = s2;
		this.s3 = s3;
	}
	public void getArea(){
		double s = (s1 + s2 + s3) / 2;
        double area = Math.sqrt(s * (s - s1) * (s - s2) * (s - s3));
        System.out.println("The area is "+area);
	}
	public void getPerimeter(){
		double p = s1 + s2 + s3;
		System.out.println("The perimeter is "+p);
	}
}


class TriangleExp{
	public static void main(String[] args) {
		Triangle t = new Triangle(12,16,18);
		t.getArea();
		t.getPerimeter();
	}
}