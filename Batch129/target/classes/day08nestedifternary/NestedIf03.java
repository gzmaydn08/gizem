package day08nestedifternary;

import java.util.Scanner;

public class NestedIf03 {

    public static void main(String[] args) {


       /* Password'un ilk harfi buyuk harf ise
        'A' olursa gecerli password yazdirin degilse gecersiz password yazdirin
        Ajlemci ==> geçerli

        Passwordun ilk harfi kucuk harf ise
        'z' olursa gecerli passworde yazdirin degilse gecersiz password yazdirin
        zehirli ==> geçerli

        */

        Scanner input = new Scanner(System.in);
        System.out.println("passwordunuzu giriniz");
        String pwd = input.nextLine();

        char firstChar = pwd.charAt(0);

        if (firstChar>='A' && firstChar<='Z' ){
            if (firstChar=='A'){
                System.out.println("geçerli");
            }else {
                System.out.println("geçersiz");
            }

        }else  if (firstChar>='a' && firstChar<= 'z'){
            if(firstChar =='z'){
                System.out.println("geçerli");
            }else {
                System.out.println("geçersiz");
            }

        }else {
            System.out.println("ilk karakter harf olmalı.......");
        }



    }
}
