package Lecture.Lec1;

public class array {
  public static void main(String[] args) {
    int[] arr = new int[10]; // пустой массив
    System.out.println(arr.length); // 10

    arr = new int[] {1,2,3,4,5};
    System.out.println(arr.length); // 5

    // а можно и так инициализировать массив
    int arr2[]; // отличия есть от обычной инициализации

    int[] arr1 = {1,2,3,4,5};
    arr[5] = 13;
    System.out.println(arr1.length); // 5
    System.out.println(arr1[3]);


    //Многомерные массивы
    int[] arr3[] = new int[3][5]; //Массив 3 строки, 5 столбцов
    for (int[] line : arr3) {
      for (int item : line) {
        System.out.printf("%d", item);
      }
      System.out.println();
    }

    //Или так, не совсем двумерный массив, а массив в масиве
    int[][] arr4 = new int[3][5];
    for (int i = 0; i < arr4.length; i++) {
      for (int j = 0; j < arr4.length; j++) {
        System.out.printf("%d", arr4[i][j]);
      }
      System.out.println();
    }
  }
}
