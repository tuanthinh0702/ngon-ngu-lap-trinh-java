import java.util.Scanner;

public class hienthicacsongto {
    public static void main(String[] args) {
        System.out.println("nhập số cần kiểm tra");
        Scanner scanner = new Scanner(System.in);
       int n = scanner.nextInt() ;

        if(songuyento(n)==true)
        {
            System.out.println(n+"là số nguyên tố");
        }
        else
        {
            System.out.println(n+"không phải là số nguyên tố");
        }
    }

    public static boolean songuyento(int num) {
        if (num < 2) {
            return false;
        } else if (num > 2) {
            if (num % 2 == 0) {
                return false;
            }
            for (int i = 3; i < Math.sqrt((float) num); i += 2) {
                if (num % i == 0) {
                    return false;
                }
            }
            return true;
        }
        return true;}


}