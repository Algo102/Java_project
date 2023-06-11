package Seminar.Sem2;

// Дано четное число N (>0) и символы c1 и c2. Написать метод, который вернет строку 
// длины N, которая состоит из чередующихся символов c1 и c2, начиная с c1.

public class Task1_StrBuil {
  public static void main(String[] args) {
    int n = 10;
    char c1 = 'a'; 
    char c2 = 'b';

    // Метод 1
    StringN(n, c1, c2);

    // Метод 2
    // String strOut = StringCC(n, c1, c2);
    // System.out.println(strOut);
    System.out.println(StringCC(n, c1, c2));

  }

  public static void StringN(int n, char c1, char c2){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < n/2; i++) {
      sb.append(c1).append(c2);      
    }
    System.out.println(sb);
  }

  // Или так
  public static String StringCC(int n, char c1, char c2){
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i <= n/2; i++) {
      sb.append(c1).append(c2);      
    }
    return sb.toString();
  }
  
}
