package Seminar.Sem3;

import java.util.Arrays;

public class T0_Split {
  public static void main(String[] args) {
    String result = "24 + 45 = 69";
    String[] arr = result.split(" ");
    System.out.println(Arrays.toString(arr));
    System.out.println(arr[0]);
    System.out.println(arr[2]);
    System.out.println(arr[4]);
    int sum = Integer.parseInt(arr[0]) + Integer.parseInt(arr[2]);
    System.out.println(sum);
  }
}
