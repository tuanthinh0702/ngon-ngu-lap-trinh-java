import java.util.Scanner;

public class hienthicacloaihinh {
    public static void main(String[] args) {
        System.out.println("1.print the retangle");
        System.out.println("2.Print the Square triangle (The corner is square at 4 different angles: top-left, top-right,bottom-left,bottom-right)");
        System.out.println("3.Print isosceles triangle");
        System.out.println("Exit");
        System.out.print("nhập lựa chọn:");
        Scanner scanner= new Scanner(System.in);
        int choice = scanner.nextInt();
switch(choice)
{
    case 1: hcn();
    break;
    case 2:tamgiacvuong();
    break;
    case 3:tamgiaccan();
    break;
    case 4:
        System.out.print("Exit");
        break;
    default:
        System.out.println("loại bỏ");
}


    }


    public static void hcn()
    {
        for(int i=1; i <= 3; i++)
        {

            for(int j=1 ; j <= 7 ; j++)
            {
                System.out.print("*");

            }

            System.out.print("\n");

        }
    }

     public static void tamgiacvuong()
     {
         String data ="";
         for(int i=1; i <= 5; i++)
         {

             for(int j=1 ; j <= i ; j++)
             {
                 System.out.print(data+"*");

             }

             System.out.print(data+"\n");

         }
         System.out.print(data);
     }
     public static void tamgiaccan()
     {
         String data ="";
         for(int i=1; i <= 5; i++)
         {

             for(int j=1 ; j <=6- i ; j++)
             {
                 System.out.print(data+"*");

             }

             System.out.print(data+"\n");

         }
         System.out.print(data);
     }

}
