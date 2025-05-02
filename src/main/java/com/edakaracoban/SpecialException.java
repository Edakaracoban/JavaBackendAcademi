package com.edakaracoban;

public class SpecialException extends  Exception{

    public SpecialException(String message){
        super(message);
    }

    public static void main(String[] args) throws SpecialException{
        throw  new SpecialException("Kendime Özel Exception");
    }
}
