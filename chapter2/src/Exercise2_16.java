
public class Exercise2_16
{
    public static void main(String args[])
    {
        for(int i=0;i<6;i++)
        {
            for(int j=0;j<i*2;j++)
            {
              System.out.print("\\");
            }
            for(int j=22;j>i*4;j--)
            {
                System.out.print("!");
            }
            for(int j=0;j<i*2;j++)
            {
              System.out.print("/");
            }
            System.out.println();
        }
    }
}
