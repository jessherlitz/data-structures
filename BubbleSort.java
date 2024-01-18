import java.util.Arrays;

public class BubbleSort {
   public static void main (String[] args) {
   
      int[] testArr = {8,7,2,1,-5};
      int[] testArrTwo = {-1,-3,1,2,5,10};

      BubbleSort.sortAsc(testArr);

      System.out.println(testArr + Arrays.toString(testArr));
   
      Sorter sorter = new Sorter();
      sorter.sort2(testArr);

      BubbleSort.sortDesc(testArrTwo);


      System.out.println(testArr + Arrays.toString(testArr));
      System.out.println(testArrTwo + Arrays.toString(testArrTwo));


   }

//////////////////////////////////////////////////
   
   public static void sortAsc(int[] array) {
      for (int i = 0; i < array.length; i++) {
         for (int j = 1; j < array.length; j++) {
            if (array[j] < array[j - 1]) {
               int temp = array[j];
               array[j] = array[j - 1];
               array[j - 1] = temp;
            }
         }
      }
   }

   public static void sortDesc(int[] array) {
      for (int i = 0; i < array.length; i++) {
         for (int j = 1; j < array.length; j++) {
            if (array[j] > array[j - 1]) {
               int temp = array[j];
               array[j] = array[j - 1];
               array[j - 1] = temp;
            }
         }
      }
   }
}
