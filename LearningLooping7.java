package programming_basics;

public class LearningLooping7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
LearningLooping7 loopingObj = new LearningLooping7(); 

//loopingObj.find_square_root(25);
//System.out.println(5+5);
//System.out.println("Hi "+ 5 + 5);
//System.out.println("Hi "+ "Hello ");
//loopingObj.decimal_to_binary(); 
loopingObj.binary_to_decimal();
	}

	private void binary_to_decimal() {
		// TODO Auto-generated method stub
		int no = 110; 
		int power = 0; 
		LearningLooping4 ll = new LearningLooping4();
		int decimal = 0; 
		while(no>0)
		{
			int rem = no % 10;
			int result = rem * ll.find_power(2, power);
			//System.out.println(result);
			decimal = decimal + result;
			no = no/10; 
			power = power + 1; 
		}
		System.out.println(decimal);
	}

	private void decimal_to_binary() {
		// TODO Auto-generated method stub
		int box = 65; 
		String result = ""; 
		while(box>0)
		{
		int rem = box%2; 
		result = rem + result; 
		box = box / 2; 
		}
		System.out.println("Binary is "+ result);
		
	}

	private void find_square_root(int no) {
		// TODO Auto-generated method stub
		int divisor = 2; 
		while(divisor<no)
		{
		if(no/divisor == divisor)
		{
		System.out.println("Square Root is " + divisor); 
		break; 
		}
		divisor = divisor + 1;
		}
		
	}

}
