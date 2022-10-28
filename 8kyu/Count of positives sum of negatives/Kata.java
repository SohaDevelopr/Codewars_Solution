/*Given an array of integers.

Return an array, where the first element is the count of positives numbers and the second element is sum of negative numbers. 0 is neither positive nor negative.

If the input is an empty array or is null, return an empty array.

Example
For input [1, 2, 3, 4, 5, 6, 7, 8, 9, 10, -11, -12, -13, -14, -15], you should return [10, -65].
*/ 

// My Code
public class Kata {
    public static int[] countPositivesSumNegatives(int[] input){
    if(input == null || input.length == 0){
      int [] nullArray={};
        return nullArray; //return an array with count of positives and sum of negative.
      }
     int sumNegative=0;
      int countPositives=0;
      for(int i=0;i<input.length;i++){
        if(input[i] != 0){
      if(input[i] > 0 ){
        countPositives++;
      }
      if (input[i] < 0 ){
        sumNegative+=input[i];
      }
          }
      }
       int newArray []= new int []{countPositives,sumNegative};
      return newArray;
    }
}