import java.util.Scanner;

public class hienthisongto {
    public static void main(String[] args) {
        System.out.println("nhập một số từ bàn phím");
        Scanner scanner = new Scanner(System.in);
        int num ;
        int a ;
        int count =0;
        int dem =0;
                 do {
                   num = scanner.nextInt();
                   a = scanner.nextInt();
                 }while (a<num);
        System.out.println(num+"số nguyên tố đầu tiên là ");
        for(int j =2; j<=a;j++)
        {
            if(kiemtrasongto(j))
            {
                count++;
            }
        }
        if(count>=num)
        {
            for(int i =2;i<=a;i++)
            {
                if(kiemtrasongto(i))
                {
                    dem++;
                    System.out.print(i+"");
                    if (dem==num)
                    {
                        break;
                    }
                }
            }
        }
        else
        {
            System.out.print("dữ liệu nhập sai");
        }

    }



         public static boolean kiemtrasongto(int num )
        {
            if(num < 2)
            {
              return false;
            }
           else
            {
                for(int i =2; i < num;i++)
                {
                    if(num%i==0 && num%2==0)
                    {
                        return false;
                    }
                }
                return true;
            }

        }
    }

