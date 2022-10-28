public class Bob {
    public static int enough(int cap, int on, int wait){
    // your code here 
      int s;
      if(on==wait){
     return 0 ;
    }
    else{
      s=Math.abs(cap-(on+wait));  
    }
    return s;  
    }
  }