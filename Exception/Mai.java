import java.io.*;
class Mai
{
	public static void main(String args[])
	{
		try
		{
			FileReader obj=new FileReader("somefile.txt");
		}
		catch(FileNotFoundException e)
		{
			e.printStackTrace();
		}
	}
}