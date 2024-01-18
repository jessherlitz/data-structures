
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

}