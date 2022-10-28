
// My solution
public class AbbreviateTwoWords {

    public static String abbrevName(String name) {
      String [] part2 = name.split(" ");
  return part2 [0].substring(0, 1).toUpperCase() +"." + part2 [1].substring(0, 1).toUpperCase();
    }
  }
