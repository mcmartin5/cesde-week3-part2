package com.example;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello from Java!");
        Calculator calc = new Calculator();

        int result = calc.sum(120, 40);

        System.out.println("The result is: " + result);
    }
}