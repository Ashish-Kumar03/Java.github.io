class Super
{
	Super()
	{
		System.out.println("Constructor of Parent.");
	}
	void disp()
	{
		System.out.println("Parent method.");
	}
}
class Chi extends Super
{
	Chi()
	{
		System.out.println("Constructor of Child.");
	}
	void disp()
	{
		System.out.println("Child method.");
		super.disp();
	}
	public static void main(String args[])
	{
		Chi obj=new Chi();
		obj.disp();
	}
}