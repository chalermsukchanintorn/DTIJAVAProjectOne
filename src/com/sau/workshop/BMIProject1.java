//โปรแกรมคำนวณหาค่า BMI โดยรับค่า
//ชื่อ น้ำหนัก (kg) ส่วนสูง (m) ทางแป้นพิมพ์
//แล้วแสดงผลค่า BMI ทางหน้าจอ
//BMI = น้ำหนัก ÷ ส่วนสูง²

package com.sau.workshop;

import java.text.DecimalFormat;
import java.util.Scanner;

public class BMIProject1 {
    public static void main(String[] args) {
        String fullName;
        double weight, height, bmi;

        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.000");

        System.out.println("++++++++++++++++++++++++++");
        System.out.println("  BMI Program by DTI-SAU");
        System.out.println("++++++++++++++++++++++++++");
        System.out.print("Input your name: ");
        fullName = sc.next();
        System.out.print("Input your weight: ");
        weight = sc.nextDouble();
        System.out.print("Input your height: ");
        height = sc.nextDouble();
        System.out.println("++++++++++++++++++++++++++");
        //bmi = weight / height * height;
        bmi = weight / Math.pow(height, 2);
        System.out.println("BMI of " + fullName + " is " + df.format(bmi) );
        System.out.println("++++++++++++++++++++++++++");
    }
}














