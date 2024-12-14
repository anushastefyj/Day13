import java.util.*;
public class Try_Catch
{
    public static void main(String args[])
    {
        try
        {
            int d=90/0;
        }
        catch(ArithmeticException v)
        {
            System.out.println("Bad Request");
            try
            {
                int d=90/0;
            }
            catch(ArithmeticException e)
            {
                System.out.println("catch block is running");
            }
            finally
            {
                System.out.println("Finally is running");
            }
            
        }
    }
}