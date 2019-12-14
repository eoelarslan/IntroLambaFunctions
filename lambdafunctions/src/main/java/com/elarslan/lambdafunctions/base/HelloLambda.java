package com.elarslan.lambdafunctions.base;

import com.elarslan.lambdafunctions.FunctionVersusOOP.oop.Hello;

public class HelloLambda {

    public void oldHello() {
        System.out.println("Hello in an old way");
    }

    public void hello(Hello hello){
        hello.say();
    }
}
