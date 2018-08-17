package com.company;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        System.out.print("Insert year of work: ");
        int year = scanner.nextInt();

        System.out.println();
        System.out.print("Insert level: ");
        int level = scanner.nextInt();

        System.out.println();
        if(level >= 1 && level <= 5){
                System.out.print("Employee salary: "+((level*4000000)+(year*500000)));
        }else{
            System.out.println("you insert the wrong level");
        }

    }
}
