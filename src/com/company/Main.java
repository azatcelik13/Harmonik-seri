package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner inp =new Scanner(System.in);
        System.out.print("N sayısını giriniz= ");
        double n= inp.nextDouble();
        double result=0;
        for (double i=1;i<=n;i++){
            result=result+(1/i);
        }
        System.out.println(result);

    }
}
