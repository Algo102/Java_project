package Seminar.Sem2;
// Метод который, сжимает строку
// Ввод aaaabbbcdd
// Вывод a4b3cd2
public class Task2_StrBuid {
  public static void main(String[] args) {
    String strIn = "aaaabbbcddv";

    long m1 = System.currentTimeMillis();
    // тернарным оператором исключил 1
    System.out.println(StrCompr(strIn));
    long m2 = System.currentTimeMillis();
    System.out.println("Time: " + (m2-m1));

    long n1 = System.currentTimeMillis();
    // исключил 1 без терного оператора
    System.out.println(StrCompr2(strIn));
    long n2 = System.currentTimeMillis(); 
    System.out.println("Time: " + (n2-n1));

    long o1 = System.currentTimeMillis();
    // Через строки
    System.out.println(Str_arh(strIn));   
    long o2 = System.currentTimeMillis();
    System.out.println("Time: " + (o2-o1));
    
    
  }

  public static String StrCompr(String str) {
    StringBuilder sbIn = new StringBuilder(str);
    StringBuilder sbOut = new StringBuilder();      
    int count = 1;
    char currCh = sbIn.charAt(0);
    for (int i = 1; i < sbIn.length(); i++) {        
      if(sbIn.charAt(i) == currCh)
        count++;
      else{
        currCh = sbIn.charAt(i);
        sbOut.append(sbIn.charAt(i-1)).append(count>1 ? count : "");
        count = 1;       
      }        
    }    
    return sbOut.toString()+sbIn.charAt(sbIn.length()-1)+(count>1 ? count : "");
  }

  public static String StrCompr2(String str) {
    StringBuilder sbIn = new StringBuilder(str);
    StringBuilder sbOut = new StringBuilder();      
    int count = 1;
    char currCh = sbIn.charAt(0);
    for (int i = 1; i < sbIn.length(); i++) {        
      if(sbIn.charAt(i) == currCh)
        count++;
      else{
        if (count == 1){
          currCh = sbIn.charAt(i);
          sbOut.append(sbIn.charAt(i-1));
          count = 1;
        }
        else{          
          sbOut.append(sbIn.charAt(i-1)).append(count);
          currCh = sbIn.charAt(i);
          count = 1;
        }          
      }        
    }
    if (count == 1)
      return sbOut.toString()+sbIn.charAt(sbIn.length()-1);        
    return sbOut.toString()+sbIn.charAt(sbIn.length()-1)+count;
  }

  public static String Str_arh(String str) {
    String strRes = "";        
    int count = 1;
    char currCh = str.charAt(0);
    for (int i = 1; i < str.length(); i++) {        
      if(str.charAt(i) == currCh)
        count++;
      else{
        strRes += String.valueOf(currCh) + (count>1 ? count : "");
        currCh = str.charAt(i);        
        count = 1;       
      }        
    } 
    strRes += String.valueOf(currCh) + (count>1 ? count : "");   
    return strRes;
  }

}
