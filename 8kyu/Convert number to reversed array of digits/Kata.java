/*
Convert number to reversed array of digits
Given a random non-negative number, you have to return the digits of this number within an array in reverse order.

Example(Input => Output):
35231 => [1,3,2,5,3]
0 => [0]
*/ 

// My Code
public class Kata {
    public static int[] digitize(long n) {
      // Code here
        String s =String.valueOf(n);
    int count=0;
    System.out.println(s);
    int [] st =new int[s.length()];
     for(int i=s.length()-1; i>=0;i--){
      st[i]=Integer.parseInt(Character.toString(s.charAt(count++)));
     }
        return st;
    }
    }
  
