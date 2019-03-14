public class A
{
  protected String x;
  
  public A()
  {
    this("not very cool");
  }
  
  public A(String y)
  {
    x = y;
  }
  
  public String toString()
  {
    return this.x;
  }
}
  