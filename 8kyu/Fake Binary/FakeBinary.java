/*
Given a string of digits, you should replace any digit below 5 with '0' and any digit 5 and above with '1'. 
Return the resulting string.
Note: input will never be an empty string
*/ 

// My code

package Fake_Binary;

public class FakeBinary {
    public static String fakeBin(String numberString) {
     char [] arrayString =numberString.toCharArray();
    String h ="";
    for(int i=0 ; i<arrayString.length;i++){
     if(arrayString[i]>=48 && arrayString[i]<=52){
      arrayString[i]='0';
      h+=arrayString[i];
     }
     else{
       arrayString[i]='1';
       h+=arrayString[i];
    
    }
    }
    return h;
    }
    
    }
