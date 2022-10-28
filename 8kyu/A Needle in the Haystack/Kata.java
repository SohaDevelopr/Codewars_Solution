public class Kata {
    public static String findNeedle(Object[] haystack) {
      // Your code here
         int indexOfNeedle=0 ;
    for(int i=0; i<haystack.length;i++){
       if(haystack[i]=="needle") {
       indexOfNeedle=i;
       }
    } 
    return "found the needle at position "+indexOfNeedle;
    }
  }
