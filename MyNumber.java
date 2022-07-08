
public class MyNumber implements IntOperations {
	public boolean isOdd(int num) {
		if(num%2!=0)
		{
			System.out.println("number is odd: "+num);
		}
		else
		{
			//System.out.println("number is not odd: "+num);
		}
		return false;
	}
	
	
	public boolean isEven(int num) {
		if(num%2==0)
		{
			System.out.println("number is Even: "+num);
		}
		else
		{
			//System.out.println("number is not odd: "+num);
		}
		return false;
	}



	public boolean isPrime(int num) {
		boolean flag = false;
		for(int i=2;i<=num/2;i++)
		{
			if(num%i==0) {
				flag=true;
				break;
			}
		}
		if(!flag)
			System.out.println("Number is prime: "+num);
		//else
			//System.out.println("Number is  not prime: "+num);
		
		//return flag;
		return flag;
	}



	public boolean calFactorial(int num) {
		int fact=1;
		for(int i=1;i<=num;i++)
		{
			fact=fact*i;
		}
		System.out.println("Factorial is: "+fact);
	
		return false;
	}
	
	
	//Added by Tejas
	
	

}
