//(c) A+ Computer Science
// www.apluscompsci.com

//Matrix output example 3 

import static java.lang.System.*;

public class MatrixOutThree
{
 public static void main(String args[])
 {
  int[][] mat = {{5,6,8,9},
       {2,3,5,0},
       {4,5,9,3}};
int z = 0;
   for( int[] x : mat)
   {
     System.out.print("row " + z++ + "   ");
     for( int y : x )
       System.out.print( y + " ");
     System.out.println();
   }
  
  
  //expected output
  /*
   row 0   5  6  8  9
   row 1   2  3  5  0
   row 2   4  5  9  3
  */
 }
}
