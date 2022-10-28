import java.util.Arrays;

public class SmashWords {

  public static String smash(String [] words) {
    // TODO Write your code below this comment please
   String stringWords="";
     for (String word : words) {
      stringWords+=word.concat(" ");   
     }
    return stringWords.trim();
  
  }
}
