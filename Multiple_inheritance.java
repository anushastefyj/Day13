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
class c extends b
{
    public void p3()
    {
        System.out.println("AMARAN");
    }
}
public class Multiple_inheritance
{
    public static void main(String args[])
    {
        c y=new c();
        y.p1();
        y.p2();
         y.p3();
       
    }
}
