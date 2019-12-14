package com.elarslan.lambdafunctions;

import com.elarslan.lambdafunctions.FunctionVersusOOP.oop.Hello;
import com.elarslan.lambdafunctions.FunctionVersusOOP.oop.SayHelloWordInSpanish;
import com.elarslan.lambdafunctions.base.HelloLambda;

import java.io.IOException;


public class LambdaFunctions {

    public static void main(String[] args) throws IOException {

        //OOP - Creating Polymorphism
        HelloLambda lambda = new HelloLambda();
        Hello sayHelloWordInSpanish = new SayHelloWordInSpanish(); //Object of class is created.

        lambda.hello(sayHelloWordInSpanish); //Lambda expression is created.

        // Functional Programming
        Hello lambdaHello = () -> System.out.println("Hello World");

        Hello greeting = new Hello() {// Anonymous inner class
            @Override
            public void say() {
                System.out.println("Bonjour");
            }
        };

        Hello greeting2 = new Hello() {// Anonymous inner class
            @Override
            public void say() {
                System.out.println("Hello World");
            }
        };

    lambda.hello(lambdaHello);
    lambda.hello(greeting);
    lambda.hello(() -> System.out.println("Hello World"));//Binding lambda expression and interface.
    }
}
