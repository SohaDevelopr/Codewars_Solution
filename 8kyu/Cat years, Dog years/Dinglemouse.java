public class Dinglemouse {

    public static int[] humanYearsCatYearsDogYears(final int humanYears) {
      // Your code here!
     int catYears=15;
      int dogYears=15;
      switch (humanYears) {
          case 1:
              return new int[]{humanYears,catYears,dogYears};
          case 2:
              return new int[]{humanYears,catYears+9,dogYears+9};
          default:
              return new int[]{humanYears,4*(humanYears-2)+24,5*(humanYears-2)+24};
      }
    
    }
  
  }