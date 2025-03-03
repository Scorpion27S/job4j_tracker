package ru.job4j.oop;

public class Calculator {

    private static int x = 5;

    public static int minus(int i) {
        return i - x;
    }

    public int divide(int z) {
        return z / x;
    }

    public int multiply(int a) {
        return x * a;
    }

    public static int sum(int y) {
        return x + y;
    }

    public int sumAllOperation(int value) {
        return x + minus(value) + divide(value) + multiply(value) + sum(value);
    }

    public static void main(String[] args) {
        int result = Calculator.sum(10);
        System.out.println(result);
        result = Calculator.minus(10);
        System.out.println(result);
        Calculator calculator = new Calculator();
        result = calculator.divide(50);
        System.out.println(result);
        Calculator multi = new Calculator();
        result = multi.multiply(5);
        System.out.println(result);
        Calculator allSumm = new Calculator();
        result = allSumm.sumAllOperation(10);
        System.out.println(result);
    }
}