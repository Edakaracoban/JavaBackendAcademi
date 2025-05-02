package com.edakaracoban;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class DateAndJava {

    public static  void dateMethod(){
        Date date=new Date();
        System.out.println(date); //Şuandaki zaman
        System.out.println(date.getTime()); //1 ocak 1970 yılından şimdiki zamana kadar geçen milisaniye
        //1000 milisaniye = 1 saniye
        System.out.println(date.getDate());
        System.out.println(date.getDay());
        System.out.println(date.getMonth());
        System.out.println(date.getYear()+1900);
    }
    public static void main(String[] args) {
       // dateMethod();
//        String nowDate=NowFormat();
//        System.out.println(nowDate);
//       String format= nowFormat1();
//        System.out.println(format);
//
//        String format2=nowFormat2();
//        System.out.println(format2);
        System.out.println(nowFormat3());

    }

    public static String NowFormat() throws NumberFormatException{
        Date date =new Date();
        String specialFormat ="Zaman:"
                .concat(String.valueOf(date.getHours()))
                .concat(String.valueOf(date.getMinutes()))
                .concat(String.valueOf(date.getSeconds()))
                .toString();
        return  specialFormat;
    }

    public static String nowFormat1() throws NumberFormatException{
        Date now=new Date();
        return  String.format("Şimdiki zaman %02d:%02d:%02d",now.getHours(),now.getMinutes(),now.getSeconds());
    }

//    public static String nowFormat2() throws NumberFormatException{
//        return new Date(String.format("Şimdiki zaman %02d:%02d:%02d",now.getHours(),now.getMinutes(),now.getSeconds())).toString();
//    }

    public static String nowFormat3() throws  NullPointerException{
        Date now= new Date();
        Locale locale=new Locale("tr","TR");
        SimpleDateFormat sdf=new SimpleDateFormat("dd/MMMM/yyyy hh:mm:ss");
        String formatDate=String.format("Şimdiki Zaman : %s",sdf.format(now));
        return new Date().toString()+" - "+formatDate;
    }






}
