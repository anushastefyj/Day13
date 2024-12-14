class a
{
  String name;
  int bb;
  a(String name)
  {
    this.name=name;
    this.bb=0;
  }
  public boolean cb()
  {
    return false;
  }
  public void bob()
  {
    if(cb())
    {
      bb++;
      System.out.println(name+" You borrowed "+bb+" book ");
    }else{
      System.out.println("Your Limit Exceeded!");
    }
  }
  public void rb()
  {
    if(bb>0){
      bb--;
      System.out.println(name+" you returned books and remaings books are: "+bb);
    }else{
      System.out.println(name+" you didnot took any book form library");
    }
  }
}
class students extends a
{
  students(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<3;
  }
}
class teachers extends a
{
  teachers(String name)
  {
    super(name);
  }
  public boolean cb()
  {
    return bb<10;
  }
}
public class library {
  public static void main(String[] args) {
      a a1 = new students("Amar");
      a b1 = new students("Lalitha");
      a b = new teachers("Dr.Prem Kumar");
      b1.bob();
      b1.bob();
      b1.bob();
      b1.rb();
  }
}