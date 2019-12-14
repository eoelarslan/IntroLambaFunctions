package com.elarslan.lambdafunctions.typeinference;


import java.io.IOException;

public class TypeInferenceExample {
    public static void main(String[] args) throws IOException {
        StringLengthLambda stringLengthLambda = (String s) -> s.length();

        System.out.println(stringLengthLambda.getLength("Onur"));

        printLambda(s -> s.length());
    }

    public static void printLambda(StringLengthLambda stringLengthLambda){
        System.out.println(stringLengthLambda.getLength("Honoris"));
    }

}
