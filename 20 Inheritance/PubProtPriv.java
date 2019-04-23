//(c) A+ Computer Science
// www.apluscompsci.com

//inheritance public private protected example

import static java.lang.System.*;

<<<<<<< HEAD

=======
>>>>>>> upstream/master
class PubProtPriv
{
 public static void main ( String[] args )
 {
  Witch witch = new Witch("Harriet",21);
  out.println(witch);   //why does this not show Harriet and 21??

  witch.showProtected();
  
  witch.showPrivate();
 }
}

class Monster
{
 private String myName;    // inherited, but not accessible in sub class
 protected int myAge;     // inherited and accessible in sub class

 public Monster()
 {
  this("noname",0);
 }

 public Monster(String name)
 {
<<<<<<< HEAD
  this("noname",45);
=======
  this(name,45);
>>>>>>> upstream/master
 }

 public Monster(String name, int age)
 {
  myName = name;
  myAge = age;
 }

 public String toString()
 {
  return "Monster info :: " + myName + " - " + myAge;
 }
}

class Witch extends Monster
{
 public Witch( String name )
 {
  super(name);
 }

 public Witch( String name, int age )
 {
<<<<<<< HEAD
  super(name,age);
=======
  //what code should be here
    super(name, age);
>>>>>>> upstream/master
 }

 public void showPrivate()
 {
  out.println("\n\nshowPrivate() - accessing myName");
    
  //uncomment the following line
<<<<<<< HEAD
  //System.out.println(myName);   //name has private access in Monster
=======
  System.out.println(myName);   //name has private access in Monster
>>>>>>> upstream/master
 }

 public void showProtected()
 {
  out.println("\n\nshowProtected() - accessing myAge");
  myAge = 90876;
  System.out.println(myAge);
 }
}

<<<<<<< HEAD
=======

>>>>>>> upstream/master
