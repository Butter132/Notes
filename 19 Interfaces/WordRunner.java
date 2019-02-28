//(c) A+ Computer Science
// www.apluscompsci.com

//comparable example one

import static java.lang.System.*;
import static java.util.Collections.*;
import static java.util.ArrayList.*;

public class WordRunner
{
 public static void main ( String[] args )
 {
  Word x = new Word("dog");
  Word y = new Word("cat");
  System.out.println( x.compareTo(y) );
  
  List<Word> words = new ArrayList<Word>();
  words.add(x);
  words.add(y);
  Collections.sort(words);
  out.println(words.toString());
  
  //make a list of Word
  //call Collections.sort() and sort the list
  //print the list
  }
}