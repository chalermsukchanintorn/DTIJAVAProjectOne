package com.sau.tech;

import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;

public class MyClass04 {
    public static void main(String[] args) throws IOException {
        String empName;
        double empSalary, tax10;

        InputStreamReader input = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(input);

        System.out.print("Input employee name: ");
        empName = reader.readLine();
        System.out.print("Input employee salary: ");
        empSalary = Double.parseDouble( reader.readLine() ) ;

        System.out.println("----------------------------");

        tax10 = empSalary * 10 / 100;

        System.out.println("Your name: " + empName);
        System.out.println("Your salary:" + empSalary);
        System.out.println("TAX pay: " + tax10 + " Baht");
    }
}


