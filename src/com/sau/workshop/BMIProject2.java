package com.sau.workshop;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.text.DecimalFormat;

public class BMIProject2 {
    public static void main(String[] args) throws IOException {
        String fullName;
        double weight, height, bmi;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("  BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++");
        System.out.print("Input your name: ");
        fullName = reader.readLine();
        System.out.print("Input your weight: ");
        weight = Double.parseDouble( reader.readLine() );
        System.out.print("Input your height: ");
        height = Double.parseDouble( reader.readLine() );
        System.out.println("++++++++++++++++++++++++++");
        //bmi = weight / height * height;
        bmi = weight / Math.pow(height, 2);
        System.out.println("BMI of " + fullName + " is " + df.format(bmi) );
        System.out.println("++++++++++++++++++++++++++");

    }
}








