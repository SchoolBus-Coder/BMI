package com.LickingHeights;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

    double meters, kilograms, BMI;
    int inches, pounds;


        Scanner keyboard;
    keyboard = new Scanner(System.in);
    System.out.print("I am going to be calculating your BMI. What is your height.(inches please)");
    inches = keyboard.nextInt();
    meters = inches*0.0254;
    System.out.print("Next, what is your weight. (In pounds please.) ");
    pounds = keyboard.nextInt();
    kilograms = pounds*0.453592;
    BMI = kilograms/(meters*meters);
    System.out.println( BMI+ " This is your BMI, hope you liked your results! ");
    }
}
