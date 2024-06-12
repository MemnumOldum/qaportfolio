import java.util.Scanner;
 
public class Strings {
 
   public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Введите строку a:");
      String str1 = sc.nextLine();
      System.out.println("Введите строку b:");
      String str2 = sc.nextLine();
      sc.close();
      if (str1.equals(str2)) {
        System.out.println("Строки идентичны");
      } else {
        System.out.println("Строки неидентичны");
}

 
   }
}