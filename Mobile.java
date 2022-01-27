package week1day1;

public class Mobile {
	public void sendMsg(String sendMsg)
	{
		System.out.println(sendMsg);
	}
	public void makeCall(long mobNumber)
	{
		System.out.println(mobNumber);
	}
	public void saveContact(String name)
	{
		System.out.println(name);
	}
	public static void main(String[]args) 
	{
		Mobile mob = new Mobile();
		mob.sendMsg("Hi Tharani");
		mob.makeCall(9757843521L);
		mob.saveContact("Tharani");
				
	}

}
