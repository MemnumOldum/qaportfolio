import java.util.Scanner;
 
public class Numbers {
 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите число a:");
      int a = sc.nextInt();
      System.out.println("Введите число b:");
      int b = sc.nextInt();
      sc.close();
      if (a < b) {
        System.out.println("a < b");
      } else if (a > b) {
        System.out.println("a > b");
      } else {
        System.out.println("a = b");
      }
      System.out.println("a + b = " + (a + b));
      System.out.println("a - b = " + (a - b));
      System.out.println("a * b = " + (a * b));
      System.out.println("a / b = " + (a / b));
 
   }
}