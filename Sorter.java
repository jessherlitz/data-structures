public class Sorter {
  
  public void sort2(int[] array) {
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
}