package com.elarslan.lambdafunctions.FunctionVersusOOP.functional;

/**
 * Created by ersin on 7.12.2019.
 */
public class SayHelloWorldInFrench {

    public void sayIt(){
        System.out.println("Bonjour tout le monde");
    }

    public void inFunction(){

        Hello justSayIt = () ->
            System.out.println("Bonjour tout le monde");

        Calculate calculateSquare = (int a, int b) -> a*b;
        Calculate calculateSquare2 = (a, b) -> a*b;

    }

}
