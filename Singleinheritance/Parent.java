class Parent
{
	Parent()
	{
		System.out.println("Constructor of Parent.");
	}
}
class Child extends Parent
{
	Child()
	{
		System.out.println("Constructor of Child.");
	}
}
class Main
{
	public static void main(String args[])
	{
		new Child();
	}
}