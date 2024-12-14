import java.util.*;
public class hieroricalinheritance{
    public static void main(String args[]){
        b s=new b();
         s.print();
        s.display();
        c h=new c();
       
         h.show();
    }
}
class a{
    public void print(){
        System.out.println("hello");
    }
}
class b extends a{
    public void display(){
        System.out.println("anusha");
    }
}
class c extends a{
    public void show(){
        System.out.println(" how are u");
    }
}