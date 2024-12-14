import java.util.*;
class a
{
    public void p1()
    {
        System.out.println("saturday");
    }
}
class b extends a
    {
        public void p2()
        {
            System.out.println("special class");
        }
    }

public class Single_inheritance
{
    public static void main(String args[])
    {
        b y=new b();
        a h=new a();
        y.p1();
        y.p2();
       
    }
}
