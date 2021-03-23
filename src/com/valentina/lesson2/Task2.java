package com.valentina.lesson2;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        int A;
        Scanner S = new Scanner(System.in);
        System.out.print("A=");
        A = S.nextInt();
        int B;
        System.out.print("B=");
        B = S.nextInt();
        int C;
        System.out.print("C=");
        C = S.nextInt();

        if (A+B>C && A+C>B && B+C>A) {

            System.out.println("существует");
        }

        else {

            System.out.println("не существует");
        }
    }
}
