import java.util.*;
class a
{
    public void r()
    {
        System.out.println("Saturday");
    }
}
class b extends a
{
    public void r1()
    {
        super.r();
        System.out.println("Special Class");
    }
}
public class Super_Keyword
{
    public static void main(String args[])
    {
        b n=new b();
        n.r1();
    }
}