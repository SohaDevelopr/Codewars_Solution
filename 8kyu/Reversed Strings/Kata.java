// My Solution

public class Kata {

    public static String solution(String str) {
      // Your code here...
      String reverse ="";
      for(int i=str.length()-1;i>=0;i--){
      reverse+=str.charAt(i);
        }
      return reverse;
    }
  
  }
