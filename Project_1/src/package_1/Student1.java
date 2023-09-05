package package_1;

public class Student1 {
	
	int roll_number;
	int age;
	
	public void abc()
	{
		System.out.println("Welcome to the World Of Core Java");
	}
	
	public void xyz()
	{
		System.out.println("Automation is very Easy");
	}
	
    public static void main(String[] args) {
		Student1 ob = new Student1();
		ob.age = 40;
		System.out.println("The Age of Student is " +ob.age);
		ob.roll_number = 1079010;
		System.out.println("The Roll Number of Student is " +ob.roll_number );
		ob.abc();
		ob.xyz();
		
	}
    
}
