package package_1;

// {}  ---- Boundary of class
public class Student  //Class creation
{
	int a; //store a int value - Variable 1
	
	public void abc () //Method 1
	{
		System.out.println("Welcome to the World of Java");//print by typing syso then ctrl +Spacebar
	}
	
	public static void main(String[] args) //Main Method Creation by typing main
	{
		Student ob = new Student(); //Object Creation
		
	    ob.abc(); //Calling Method  --reference_variable.method name();
		ob.a = 23; //Calling Variable --reference_variable.value
		System.out.println("Value of a "+ob.a);  //print value of variable
		ob.a = 24; //Change of Value
		System.out.println("Value of a "+ob.a);  //print value of changed variable
	}

}

