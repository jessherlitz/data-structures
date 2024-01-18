public class StringUtils {
  

  public static String reverseString(String str) {
    String[] splitted = str.split("");
    
    StringBuilder newStr = new StringBuilder();

    for (int i = splitted.length - 1; i >= 0; i--) {
      newStr.append(splitted[i]);
    }

    return newStr.toString();
  }
}


