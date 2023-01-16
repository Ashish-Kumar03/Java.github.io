class Human
{
void eat()
{
System.out.println("human is eating");
}
}
class Boy extends Human
{
void eat()
{
System.out.println("boy is eating");
}
}
class Main{
public static void main(String args[])
{
Boy b = new Boy();//create child class object
b.eat();
}
}
