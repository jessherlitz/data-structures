
public class CountVowels {
  

  public static void main(String[] args) {
    String hello = "Hello World";

    int result = CountVowels.countVowels(hello);

    System.out.println(result);

  }

  public static int countVowels(String str) {
    if (str == null) {
      return 0;
    }

    String vowels = "aeiou";

    int count = 0;
    char[] strArr = str.toLowerCase().toCharArray();

    for (char ch : strArr) {
      if (vowels.indexOf(ch) != -1) {
        count++;
      }
    }

    return count;
  }
}

