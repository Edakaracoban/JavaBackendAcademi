package com.edakaracoban;

import java.util.Collections;
import java.util.Random;

public class Arrays {
    public static int RandomNumber() {
        Random rnd = new Random();
        int rntInt = rnd.nextInt(9) + 1;
        return rntInt;
    }

    public static void main(String[] args) {
        ArrayMethod5();
        int[] say = new int[7];
        java.util.Arrays.fill(say, RandomNumber());
        for (int i = 0; i < say.length; i++) {
//            say[i]=RandomNumber();
            java.util.Arrays.setAll(say, data -> RandomNumber());
        }

        for (int sayi : say) {
            System.out.println(sayi);
        }

//        ArrayMethod();
//        ArrayMethod1();
//       int[] sayilar= ArrayMethod4();
//       for (int sayi:sayilar){
//           System.out.println(sayi);
//       }

//      String[] yeniCity=ArrayMethod2();
//        java.util.Arrays.sort(yeniCity, Collections.reverseOrder());//büyükten küçüğe
//        java.util.Arrays.sort(yeniCity);//küçükten büyüğe

//        for (String temp : yeniCity){
//          System.out.println(temp);
        //  }
    }

    public static void ArrayMethod5() throws ArrayIndexOutOfBoundsException {
        String[] orginalCity = ArrayMethod2();
        String[] cloneCity = java.util.Arrays.copyOf(orginalCity, orginalCity.length);

        for (String c : cloneCity){
            System.out.println(c);
        }
        String searchCity="Sivas";
        int index =java.util.Arrays.binarySearch(cloneCity,searchCity);
        if (index>=0){
            System.out.println("Aradığınız değer bulunmaktadır.");
        }
        else{
            System.out.println("Aradığınız şehir yoktur.");
        }

    }
    public static String[] ArrayMethod2() throws ArrayIndexOutOfBoundsException {
        String[] sehir = {"Malatya", "Mersin", "Konya", "Muğla"};

        return sehir;
    }

    public static String[] ArrayMethod() throws ArrayIndexOutOfBoundsException {

        String[] city = new String[5];
        city[0] = "İstanbul";
        city[1] = "İzmir";
        city[2] = "Ankara";
        city[3] = "Aydın";
        city[4] = "Amasya";
        System.out.println("Son eleman : " + city[city.length - 1]);
        return city;
    }

    public static void ArrayMethod1() {
        String[] city = ArrayMethod();
    }

    public static int[] ArrayMethod4() {
        int[] numbers = new int[7];
        java.util.Arrays.fill(numbers, 5); // sadece çağır
        return numbers; // sonra diziyi döndür

    }


}
