package programming_basics;

public class LearningLooping5 {
	int prime_count; //non-static: 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LearningLooping5 ll = new LearningLooping5();
		ll.find_prime_from_first20(); 
	}

	private void find_prime_from_first20() {
		// TODO Auto-generated method stub
	//LearnLooping2 ll = new LearnLooping2();
	int no = 2; //no = 2 prime_count=2
	while(prime_count<20) //1 < 20
	{
	find_prime_number(no); //4
	no = no + 1; //5
	}
		
	}
	
	int find_prime_number(int no) {
		// TODO Auto-generated method stub
		int div = 2; 
		int count = 0; 
		while(div<no)
		{
		if(no%div == 0)
		{
	        count = count + 1; 
			break;

		}
		div = div + 1; //2 to 99
		
		}
		if(count==0)
		{
System.out.println(no+ " is Prime ");
	prime_count = prime_count + 1; 
		}
		return prime_count; 
//		else
//		{
//			System.out.println("Given Number is Not Prime");
//		}
		
	}

	}
