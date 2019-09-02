import java.lang.reflect.Array;
import java.util.Scanner;

public class docsothanhchu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
       int num = scanner.nextInt();
        String[] ChuSo = {"không","một","hai", "ba", "bốn", "năm", "sáu", "bảy ", "tám", "chín" };
//        String[] menhgia ={"hàng trăm", "hàng chục", "hàng đơn vị"};
        int hangtram= num/100;
        int hangchuc= (num%100)/10;
        int donvi = num%10 ;
        String ketqua = "";
        if(hangtram==0 && hangchuc ==0 && donvi ==0) {
            System.out.println("");
        }
        if(hangtram!=0)
        {
            ketqua += ChuSo[hangtram] + " trăm" +" và" + " ";
            if ((hangchuc == 0)&&(donvi != 0))
            {
                ketqua += " và ";
            }
        }
        if((hangchuc!=0)&&(hangchuc !=1))
        {
            ketqua += ChuSo[hangchuc] + " chục"+" và"+" ";
            if((hangchuc == 0) && (donvi != 0))
            {
                ketqua  = ketqua + "và";
            }
        }
        if(hangchuc ==1)
        {
            ketqua += "mười";
        }
        switch (donvi)
        {
            case 1:
                if(hangchuc != 0 && hangchuc!=1)
                {
                    ketqua += "mốt";

                }
                else
                {
                    ketqua += ChuSo[donvi] + "đơn vị";
                }
                break;
            case 5:
                if(hangchuc ==0)
                {
                    ketqua += ChuSo[donvi] + "đơn vị";
                }
                else
                {
                    ketqua +="lăm";
                };
                break;
            default:
                if(donvi != 0)
                {
                    ketqua += ChuSo[donvi];
                }
                break;
        }
        System.out.println(ketqua);
    }
}
