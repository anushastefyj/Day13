import java.util.*;
class gp
{
    public void r()
    {
        System.out.println("Hello you are grand parent");
    }
}
class p1 extends gp{
    public void r1()
    {
        System.out.println("You are parent one");
    }
}
interface p2
{
    void r2();
}
class d extends p1 implements p2{
    public void r2()
    {
        System.out.println("You are parent two");
    }
public void r3()
{
    System.out.println("You are parent three");
}
}
public class Hybrid_Inheritance
{
    public static void main(String args[])
    {
        d h=new d();
        h.r();
        h.r1();
        h.r2();
        h.r3();
    }
}