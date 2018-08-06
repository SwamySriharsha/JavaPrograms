
class Person{
	private String name;
	private String phoneNo;
	private String email;

	public void setDetails(String name, String phoneNo, String email){
		this.name = name;
		this.phoneNo = phoneNo;
		this.email = email;
	}
	public void getDetails(){
		System.out.print("Name: "+name+" PhoneNo: "+phoneNo+" Email: "+email);
	}
}

class Student extends Person{
	private int year;
	public void setDetails(String name, String phoneNo, String email, int year){
		setDetails(name, phoneNo, email);
		this.year = year;
	}
	public void getDetails(){
		super.getDetails();
		System.out.println(" Year: "+year);
	}
}

class Employee extends Person{
	private int salary;
	public void setDetails(String name, String phoneNo, String email, int salary){
		setDetails(name, phoneNo, email);
		this.salary = salary;
	}
	public void getDetails(){
		super.getDetails();
		System.out.println(" Salary: "+salary);
	}

}

class TestInhe{
	public static void main(String[] args) {
		Student s1 = new Student();
		s1.setDetails("harsha","8500003388","ronanki.swamy@gmail.com",4);
		s1.getDetails();
		Employee e1 = new Employee();
		e1.setDetails("swamy","8500500600","mytest.swamy@gmail.com",30000);
		e1.getDetails();
	}
}