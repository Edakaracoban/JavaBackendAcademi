package com.edakaracoban;

import java.io.IOException;
import java.util.Scanner;

public class Cast {
    public static void main(String[] args) throws ArithmeticException, IOException,NumberFormatException {

        //Widening Cast => Implicit Cast
        int castInt =100; //Küçük olan veriyi büyük olan verinin içine ekledim burada veri kaybı yoktur.
        double castDouble=castInt;
        System.out.println(castDouble);

        //Narrowing Cast => Excilicit Cast //Büyük olan veriyi küçük olan veriye dönüştürmek için kullanılır.
        int cast1Int=111111;
        byte castByte =(byte) cast1Int;
        System.out.println(castByte);

        //Acii
        char charCast='A';
        int asciiCharacter =charCast;
        System.out.println(asciiCharacter);

        //String => Int
        String castString = "10";
        int castInt2 = Integer.valueOf(castString);
        int castInt3 = Integer.parseInt(castString);
        System.out.println(castString+20);
        System.out.println(castInt2+20);

        //Int => String
        int castString3=22;
        String cast5=String.valueOf(castString3);
        System.out.println(cast5);

        //EXCEPTION
        try {   Scanner scanner=new Scanner(System.in);

            System.out.println("Lütfen bir sayı giriniz");
            int sayi ,sayi1;
            sayi=scanner.nextInt();
            System.out.println("Lütfen bir sayı giriniz");
            sayi1=scanner.nextInt();
            int result =sayi/sayi1;
            System.out.println(result);

        }catch(ArithmeticException e){
           e.getMessage();
        }
        finally {
            System.out.println("Ben her zaman çalışırım");
        }



        int number1=25;
        int number2=0;
        try{
            System.out.println(number1/number2);
        }
        catch (ArithmeticException ai){
            ai.printStackTrace();
            ai.getMessage();
        }
    }
}
