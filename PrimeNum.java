 package week1.day2;

public class PrimeNum {
	public static void main(String[]args)
	{
		int num = 13;
		boolean flag = false;
		for(int i=2; i<=num/2; i++)
		{
			if(num%2 ==0)
			{
				flag = true;
				break;
			}
		}
		System.out.println(flag);
		if(flag == false) {
			System.out.println("The number "+num+" is a Prime Number");
		}
		else {
			System.out.println("The number "+num+" is not a Prime Number");
		}
	}

}
