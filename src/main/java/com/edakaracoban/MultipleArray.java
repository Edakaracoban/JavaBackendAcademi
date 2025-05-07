package com.edakaracoban;

import java.util.Scanner;

public class MultipleArray {
    public static void main(String[] args) {


        //Soru
        //Kullanıcıdan girilen tam sayının faktöriyelini bulma: iterative ve recursive methoda göre çözümünü yapınız.
        //Kullanıcı 0 dan küçük bir sayı verene kadar hesaplama yapsın.
        //validation: Kullanıcı 0 dan küçük sayı verirse döngü dursun
        //validation: KuLLanıcı virgüllü sayı verirse tekrar sayı girmesi istensin.
        // Eğer sayı 5 kere virgüllü sayı girerse  hakkı bitti ve sistemden çıksın.


        //ITERATIVE
        byte remaining = 3;
        while (remaining <= 3 && remaining >= 1) {
            long number, result = 1;//1 sayısı çarpmada etkisizdir ve başlangıç değerimizdir.
            Scanner scanner = new Scanner(System.in);
            System.out.println("Lütfen pozitif bir sayı giriniz");
            boolean isA=true;
            // kullanıcıdan ondalıklı sayı girip girmediğini kontrol edelim.
            if (scanner.hasNextInt()) {
                number = scanner.nextLong();
                if (number < 0) {
                    System.out.println("Sıfırdan küçük bir sayı girdiniz : " + number + " sistem kapatılıyor....");
                    // number = Math.abs(number);
                    break;//(Yalnızca bulunduğu döngüyü etkiliyor.)
                    // System.exit(0); //JVM yi kapatarak programı tamamen sonlandırıyor.
                } else if (number == 0) {
                    System.out.println("0 ın faktöriyeli :1 ");
                } else {
                    result = 1;
                    for (int i = 1; i <= number; i++) {
                        result *= i;
                    }
                    System.out.println(number + " Sayısının faktöriyeli: " + result);
                }
            } else if (scanner.hasNextDouble()) {
                if (remaining - 1 == 0) {
                    System.out.println("Hakkınız bitmiştir.");
                   isA=false;
                   System.exit(0);
                   scanner.next(); //geçersiz girdileri temizler
                } else {
                    System.out.println("Kalan hakkınız : " + (remaining - 1));
                }
                System.out.println("ondalıklı sayı girdiniz");
                remaining--;
            } else {
                System.out.println("Harf veya boşluk girdiniz.");
                break;
            }

        }
    }
}
