public class Exercise2_11
{
	public static final int rep=7;
    public static final int ran=5;
    public static void main(String[] args)
    {
        for(int i=0;i<rep;i++)
        {
            for(int j=0;j<ran-1;j++)
            {
                System.out.print(" ");
            }
            System.out.print("|");
        }
        System.out.println();
        for(int i=0;i<rep;i++)
        {
            for(int j=1;j<ran;j++)
            {
                System.out.print(j);
            }
            System.out.print("0");
        }
    }
}
