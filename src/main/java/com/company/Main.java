package com.company;

import java.util.Scanner;
import java.util.Spliterator;

public class Main {

    public static void FindTwoPointsDistance(){
        System.out.println("FindTwoPointsDistance");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert x1: ");
        int x1 = scanner.nextInt();
        System.out.println("Insert x2: ");
        int x2 = scanner.nextInt();
        System.out.println("Insert y1: ");
        int y1 = scanner.nextInt();
        System.out.println("Insert y2: ");
        int y2 = scanner.nextInt();
        int result = (int) Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
        System.out.println("Distance between two points: " + result);
        System.out.println();
    }
    public static void FunctionValue() {
        System.out.println("Find function's value");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert x: ");
        int x = scanner.nextInt();
        int result = (int) (4 * Math.pow(x - 3,6) - 7 * Math.pow(x - 3, 3) + 2);
        System.out.println("Function's value is: " + result);
        System.out.println();

    }
    public static void RadToDegrees(){
        System.out.println("Radiance to degrees: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert angle in radiance:  ");
        double radiance = scanner.nextInt();
        double result = (radiance * 180) / 3.14  ;
        System.out.println(radiance + " angle in degrees is " + result);
        System.out.println();
    }
    public static void FtoCelsius(){
        System.out.println("Convert Fahrenheit to Celsius: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert temperature in F:  ");
        float f = scanner.nextInt();
        float result = (f - 32) * 5/9  ;
        System.out.println("Temperature in Celsius is " + result);
        System.out.println();
    }
    public static void FindDistanceBetweenTwoCars(){
        System.out.println("Convert Fahrenheit to Celsius: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert distance between cars:  ");
        int S = scanner.nextInt();
        System.out.println("Insert 1st car speed:  ");
        int V1 = scanner.nextInt();
        System.out.println("Insert 2nd car speed:  ");
        int V2 = scanner.nextInt();
        System.out.println("Insert how many ours they are moving away from each other:  ");
        int T = scanner.nextInt();
        int result = S + (V1 + V2) * T  ;
        System.out.println("Distance between car is " + result);
        System.out.println();
    }
    public static void FindHowManyBinA(){
        System.out.println("Find how many B sections in A: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert A length (A > B):  ");
        int A = scanner.nextInt();
        System.out.println("Insert B length:  ");
        int B = scanner.nextInt();
        int result = A / B;
        System.out.println(result + " B section can fit in A");
        System.out.println();
    }
    public static void FindTensAndOnes(){
        System.out.println("Find tens and ones in two-digit number: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert two-digit number:  ");
        int number = scanner.nextInt();
        int tens = number / 10;
        int ones = number % 10;
        System.out.println("Tens is " + tens + " , ones is " + ones + ".");
        System.out.println();
    }
    public static void Split3DigitNumber(){
        System.out.println("Split three digit number in reversed way: ");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Insert three-digit number:  ");
        int number = scanner.nextInt();
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int ones = number % 10;
        System.out.println(ones + " " + tens + " " + hundreds);
        System.out.println();
    }



    public static void main(String[] args) {
        FindTwoPointsDistance();
        FunctionValue();
        RadToDegrees();
        FtoCelsius();
        FindDistanceBetweenTwoCars();
        FindHowManyBinA();
        FindTensAndOnes();
        Split3DigitNumber();

    }
}
