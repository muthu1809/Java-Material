package programming_basics;

public class Learn_If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Learn_If li = new Learn_If();
		//li.learn_if1(); 
		//li.learn_if2(); 
		//li.learn_if3(); 
		//li.learn_if4(); 
		//li.learn_if5() ; 
		//li.learn_if6(); 
		li.learn_if7(); 

	}

	private void learn_if7() {
		// TODO Auto-generated method stub
		int no1 = 10, no2 = 10; 
		if(true) // boolean result: true / false
		{
			System.out.println("Hi");
		}
		
		
	}

	private void learn_if6() {
		// TODO Auto-generated method stub
		int maths = 100, science = 80; 
		if(maths==100 || science ==100)
		{
			System.out.println("Chocolate");
		}

	}

	private void learn_if5() {
		// TODO Auto-generated method stub
		int maths = 100, science = 100; 
		if(maths==100 && science ==100)
		{
			System.out.println("Chocolate");
		}

		
	}

	private void learn_if4() {
		// TODO Auto-generated method stub
		int maths =100, science = 100; 
		if(maths==100)
		{
			if(science==100)
			{
				System.out.println("Chocolate");
			}
			else
			{
				System.out.println("Pencil");
			}
		}
	
		
	}

	private void learn_if3() {
		// TODO Auto-generated method stub
		int age1 = 12; //Assignment Operator
		int age2 = 12; 
		if(age1>age2)
		{
		System.out.println("First Boy is elder and his age is " + age1); 
		}
		else if(age2==age1){ // Comparison Operator
			System.out.println("Both are of same age");
		}
		else
		{
			System.out.println("Second Boy is elder and his age is " +age2); 
		}
	}

	private void learn_if2() {
		// TODO Auto-generated method stub
		int age1 = 12; 
		int age2 = 12; 
		if(age1>age2)
		{
		System.out.println("First Boy is elder and his age is " + age1); 
		}
		else if(age2>age1){
		System.out.println("Second Boy is elder and his age is " +age2); 
		}
		else
		{
			System.out.println("Both are of same age");
		}
	}

	private void learn_if1() {
		// TODO Auto-generated method stub
		int age1 = 12; 
		int age2 = 15; 
		if(age1>age2)
		{
		System.out.println("First Boy is elder and his age is " + age1); 
		}
		else{
		System.out.println("Second Boy is elder and his age is " +age2); 
		
		}
	}
}
