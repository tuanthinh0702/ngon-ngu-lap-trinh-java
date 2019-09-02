import java.util.Scanner;

public class chuyendoitien {
    public static void main(String[] args) {
        int VND =23000;
        System.out.print("nhập USD:");
        Scanner scanner = new Scanner(System.in);
        int USD = scanner.nextInt();
        int Quydoi = USD * VND;
        System.out.println("tiền VND "+Quydoi);
    }
}
