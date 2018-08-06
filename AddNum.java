class AddNum{
	public void add(){
		int a=10;
		int b=20;
		System.out.println("Sum is "+ (a+b));
	}
	public static void main(String[] args) {
		AddNum an = new AddNum();
		an.add();
	}
}

/* 
class AddNum{
	public void add(int a,int b){
		System.out.println("Sum is "+ (a+b));
	}
	public static void main(String[] args) {
		AddNum an = new AddNum();
		an.add(20,30);
	}
}
*/