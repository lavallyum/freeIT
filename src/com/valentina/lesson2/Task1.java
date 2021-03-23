package com.valentina.lesson2;

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        int A;
        Scanner B = new Scanner(System.in);
        A = B.nextInt();
        System.out.println("это");

        if (A>=0) {
            System.out.println("положительное");
        }
        else {
            System.out.println("отрицательное");
        }

        if (A<10 && A>-10) {
            System.out.println("однозначное");
        }
        else if (A<100 && A>-100) {
            System.out.println("двухзначные");
        }
        else {
            System.out.println("Трехзначное или более");
        }

        System.out.println("число");
    }
}
