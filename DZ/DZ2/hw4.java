package DZ.DZ2;

import java.io.FileWriter;
import java.util.Scanner;

public class hw4 {
  public static void main(String[] args) {
    System.out.println("Calculator");
    
    try{
      Scanner sc = new Scanner(System.in, "cp866");       
      FileWriter writer = new FileWriter("filecacl.txt", true);

      System.out.print("Enter first number: ");
      double num1 = sc.nextDouble();
      writer.write(num1 + " ");     

      System.out.print("Enter arithmetic operation ");
      String ch = sc.next();
      writer.write(ch + " ");
    
      System.out.print("Enter second number: ");
      double num2 = sc.nextDouble();
      writer.write(num2 + " "); 

      sc.close(); 
      


      double res = 0;
      switch (ch) {
        case "+":
          res  = num1 + num2;
          writer.write(" = " + res + "\n");
          System.out.println("Your result is: " + res);
          break;
        
        case "-":
          res  = num1 - num2;
          writer.write(" = " + res + "\n");
          System.out.println("Your result is: " + res);
          break;

        case "*":
          res  = num1 * num2;
          writer.write(" = " + res + "\n");
          System.out.println("Your result is: " + res);
          break;

        case "/":
          res  = num1 / num2;
          writer.write(" = " + res + "\n");
          System.out.println("Your result is: " + res);
          break;

        default:
          System.out.println("You entered an invalid character ((( ");
          writer.write("You entered an invalid character ((( " + "\n");
          break;
      }
      writer.write("---------------------------------- " + "\n");
      writer.close();
    }
    catch (Exception e){ //Считование всех ошибок - е
      System.out.println("Что то пошло не так");
    }   
  }
}
