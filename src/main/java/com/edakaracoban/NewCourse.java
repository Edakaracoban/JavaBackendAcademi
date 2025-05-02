package com.edakaracoban;

import java.sql.SQLOutput;

public class NewCourse {
    public static void main(String[] args) {
        String vocabulary=" Java Öğreniyorum ";
        String vocabulary1=" Java OGRENİYORUM ";
        String vocabulary2="Java";

        System.out.println(vocabulary.length());
        System.out.println(vocabulary.equals(vocabulary1));
        System.out.println(vocabulary.equalsIgnoreCase(vocabulary1));
        System.out.println(vocabulary1==vocabulary);
        System.out.println(vocabulary.charAt(2 ));
        System.out.println(vocabulary.trim());
        System.out.printf(vocabulary);
        System.out.println(vocabulary.startsWith(" ")); //boşlukla mı başlıyor?
        System.out.println(vocabulary.endsWith(" ")); //boşlukla mı başlıyor?

        //substring => parçalama
        System.out.println(vocabulary.trim().substring(1).toLowerCase());
        System.out.println(vocabulary.substring(2,10)); //2 dahil 10 değil
         //System.out.println(vocabulary2.substring(1,10));

        //contains
        System.out.println(vocabulary1.contains("Java"));

        //Replace (değiştirme yerine)
        System.out.println(vocabulary1.replace("Java","c#"));
        vocabulary2=vocabulary2.replace("Java","EDA KARAÇOBAN");
        System.out.println(vocabulary2);


        //Birleştirme (CONCAT)
        String concenation=vocabulary2+vocabulary1+vocabulary;
        System.out.println(concenation);
        System.out.println(vocabulary.concat("VOCABULARY"));
        //String Builder
        StringBuilder stringBuilder =new StringBuilder();
        stringBuilder.append("jsp").append("jsf");
         String dataToString=stringBuilder.toString();
        System.out.println(dataToString);
        //String Buffer
        StringBuffer stringBuffer =new StringBuffer();
        stringBuffer.append("jsp").append("jsf");
        String dataToString1=stringBuffer.toString();
        System.out.println(dataToString1);

        //HashCode //Parmak izi
        System.out.println(vocabulary.hashCode());
        System.out.println(vocabulary1.hashCode());
        System.out.println(vocabulary2.hashCode());


























    }}