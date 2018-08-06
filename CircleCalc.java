class MyCircle{
	float radius = 5.5f;
	static final float pi = 3.14f;
	public void myPerimeter(){
		System.out.println("Perimeter is "+(2*radius*pi));
	}
	public void myArea(){
		System.out.println("Radius is "+(radius*radius*pi));
	}
}


class CircleCalc{
	public static void main(String[] args) {
		MyCircle mc = new MyCircle();
		mc.myPerimeter();
		mc.myArea();
	}
}