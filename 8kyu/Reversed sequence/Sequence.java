/*
Build a function that returns an array of integers from n to 1 where n>0.

Example : n=5 --> [5,4,3,2,1]
*/ 

public class Sequence{

    public static int[] reverse(int n){
      //your code
       int [] ReversedSequence =new int [n];
      
      for(int i=n ,j=0;i>0;i--){
       ReversedSequence[j]=i;
         j++ ;
      }
      return ReversedSequence;
    }
  
  }
