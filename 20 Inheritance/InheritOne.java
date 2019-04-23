
//inheritance example

import static java.lang.System.*;

<<<<<<< HEAD

=======
>>>>>>> upstream/master
public class InheritOne
{
  public static void main ( String[] args )
  {
  //test code in the main method
  A one = new A();
    B two = new B();

  out.println(one);
  one.setX(11);
  out.println(one.getX());

  
  out.println(two);    
  two.setX(24);
<<<<<<< HEAD
  out.println(two.getX());  
  
  System.out.println(one.equals(two)); 
  System.out.println(one.equals(one));
  }
}
  
=======
  out.println(two.getX()); 
  
  A three = new A();
  three = one;
  System.out.println( one.equals(three) );
  
  }
}

>>>>>>> upstream/master
class A
{
   private int x;
   
   public A() { 
      x =8;
   }
   
   public void setX(int val)
   {
    x=val;
   }
   
   public int getX()
   {
    return x;
   }
   
   public String toString() 
   { 
      return ""+getX();
   }
}

class B extends A
{
   //no visible code
}
<<<<<<< HEAD
=======

>>>>>>> upstream/master
