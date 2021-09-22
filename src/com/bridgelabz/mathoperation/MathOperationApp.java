package com.bridgelabz.mathoperation;

@FunctionalInterface
interface MathFunctionIF{
    int calculate(int a, int b);
}
public class MathOperationApp {
    public static void main(String[] args) {
        System.out.println("....... Welcome On Math Operation App Using Lambda Function ....");
        MathFunctionIF add = Integer::sum;
        MathFunctionIF subtract = (int a, int b) -> a-b;
        MathFunctionIF multiply = (int a, int b) -> a*b;
        MathFunctionIF divide = (int a, int b) -> a/b;

        System.out.println("ADD: "+add.calculate(6, 8));
        System.out.println("SUBTRACT: "+subtract.calculate(6, 8));
        System.out.println("MULTIPLY: "+multiply.calculate(6, 8));
        System.out.println("DIVIDE: "+divide.calculate(6, 8));
    }
}
