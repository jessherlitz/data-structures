import java.util.Arrays;

public class BubbleSort {
   public static void main (String[] args) {
   
      int[] testArr = {8,7,2,1,-5};
      int[] returnedVal = BubbleSort.sort(testArr);
   
   
      System.out.println(Arrays.toString(returnedVal));
   }


   // ARRAY IS PASSED BY VALUE, SO I HAVE TO RETURN IT?
   
   public static int[] sort(int[] array) {
      for (int i = 0; i < array.length; i++) {
         for (int j = 1; j < array.length; j++) {
            if (array[j] < array[j - 1]) {
               int temp = array[j];
               array[j] = array[j - 1];
               array[j - 1] = temp;
            }
         }
      }

      return array;
   }
}