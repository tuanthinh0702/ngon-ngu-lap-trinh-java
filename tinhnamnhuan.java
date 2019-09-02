import java.util.Scanner;
public class tinhnamnhuan {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a year");
         int Year = scanner.nextInt();
         if(Year % 4 ==0)
         {
             if(Year % 100 ==0)
             {
                 if(Year % 400 == 0)
                 {
                     System.out.printf("%d is a leap year ", Year);
                 }
                 else
                 {
                     System.out.printf("%d is NOT a leap year", Year);
                 }
             }
             else
             {
                 System.out.printf("%d is a leap year", Year);
             }
         } else
         {
             System.out.printf("%d is NOT a leap year", Year);
         }
    }
}
