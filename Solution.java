import java.util.*;
import java.util.stream.Collectors;

class Result {

  /*
   * Complete the 'timeConversion' function below.
   *
   * The function is expected to return a STRING.
   * The function accepts STRING s as parameter.
   */

  public static String timeConversion(String s) {
    String[] timeComponents = s.split(":");
    int hours = Integer.parseInt(timeComponents[0]);
    int minutes = Integer.parseInt(timeComponents[1]);
    int seconds = Integer.parseInt(timeComponents[2].substring(0, 2));
    String meridiem = timeComponents[2].substring(2);

    if (meridiem.equals("PM") && hours != 12) {
        hours += 12;
    } else if (meridiem.equals("AM") && hours == 12) {
        hours = 0;
    }

    return String.format("%02d:%02d:%02d", hours, minutes, seconds);

  }



    /*
     * Complete the 'breakingRecords' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY scores as parameter.
     */

    public static List<Integer> breakingRecords(List<Integer> scores) {
      int recordMax = scores.get(0);
      int recordMin = scores.get(0);
      int min = 0;
      int max = 0;
      
      List<Integer> newList = scores.stream()
                              .distinct()
                              .collect(Collectors.toList());
                              
      for (int i = 1; i < newList.size(); i++) {
          if (newList.get(i) > recordMax) {
              max++;
              recordMax = newList.get(i);
          } 
          if (newList.get(i) < recordMin) {
              min++;
              recordMin = newList.get(i);
          }
      }
      
      List<Integer> returnList = new ArrayList<>();
      
      returnList.add(max);
      returnList.add(min);
      
      return returnList;
      }
  

}
