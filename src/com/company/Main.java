package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {



        int i;
        double itogo;
        System.out.print("введите первоначальную сумму вклада ");
        Scanner sum = new Scanner(System.in);
        itogo = sum.nextDouble();
        System.out.print("количество месяцев ");
        Scanner month = new Scanner(System.in);
        int m = month.nextInt();
        double proz = itogo * 0.17 ;
        double itogosproz = itogo + proz;

        for (i = 1; i <= m; i++) {
            System.out.println(" проценты "+ proz*i + " общая сумма " + itogosproz*i);
        }
    }

}



