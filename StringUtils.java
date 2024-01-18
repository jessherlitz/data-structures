public class StringUtils {
  

  public static String reverseString(String str) {
    
    StringBuilder newStr = new StringBuilder();

    for (int i = str.length() - 1; i >= 0; i--) {
      newStr.append(str.charAt(i));
    }

    return newStr.toString();
  }
}

