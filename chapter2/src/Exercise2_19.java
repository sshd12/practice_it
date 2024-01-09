public class Exercise2_19
{
	public static final int size=3;
	public static void main(String args[])
	{
		for(int i=0;i<2;i++)
		{
			pl("+", "=");
			for(int j=0;j<size;j++)
			{
				pl("|", " ");
			}
		}pl("+", "=");
	}
	public static void pl(String a, String b)
	{
		System.out.print(a);
		for(int i=0;i<size;i++)
		{
			System.out.print(b);
		}
		System.out.print(a);
		for(int i=0;i<size;i++)
		{
			System.out.print(b);
		}
		System.out.print(a+"\n");
	}
}
