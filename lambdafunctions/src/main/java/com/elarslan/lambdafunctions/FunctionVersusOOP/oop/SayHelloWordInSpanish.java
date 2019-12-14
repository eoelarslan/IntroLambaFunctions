package com.elarslan.lambdafunctions.FunctionVersusOOP.oop;


public class SayHelloWordInSpanish implements Hello {
    @Override
    public void say() {
        System.out.println("Hola Mundo!");
    }

    public void inFunction(){

        Hello justSayIt = () ->
                System.out.println("Bonjour tout le monde");



    }
}
