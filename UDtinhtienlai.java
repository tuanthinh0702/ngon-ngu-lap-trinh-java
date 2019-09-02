import java.util.Scanner;

public class UDtinhtienlai {
    public static void main(String[] args) {
        double money ;
        int month = 1;
        double interset_rate =1.0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter investment amount: ");
        money = input.nextDouble();
        System.out.println("Enter number of months:");
        month = input.nextInt();
        System.out.println("Enter annual interest rate in percentange");
        interset_rate = input.nextDouble();
        double total_interest = 0;
        for (int i = 0; i< month; i++)
        {
            total_interest = money *(interset_rate/100)/12*3;
        }
        System.out.println("total of interset: " + total_interest);
    }
}
