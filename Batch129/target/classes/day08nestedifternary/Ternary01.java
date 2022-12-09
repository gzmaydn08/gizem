package day08nestedifternary;

import java.util.Scanner;

public class Ternary01 {
    public static void main(String[] args) {


        //kullanıcıdan iki sayı alınız büyük olmayan ( küçük veya eşit olan ) sayıyı yazdırınız


        Scanner input = new Scanner(System.in);
        System.out.println("İKİ SAYI GİRİNİZ...");
        double a = input.nextDouble();
        double b = input.nextDouble();

    //1.yol : if-else

        if (a<b){
            System.out.println(a);
        }else {
            System.out.println(b);
        }

    //2.yol: ternary

        double result = a<b ? a : b;
        System.out.println(result);





    }
}
