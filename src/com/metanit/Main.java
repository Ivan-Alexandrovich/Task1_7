package com.metanit;
/*Написать метод, который определяет является ли год високосным, и
выводит сообщение в консоль. Каждый 4-й год является високосным, кроме
каждого 100-го, при этом каждый 400-й – високосный.*/
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	Scanner scanner = new Scanner(System.in);
	System.out.println("Insert year number: ");
	int year = scanner.nextInt();
	Ex(year);
    }

    public static void Ex(int year) {
        if (((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0)) {
            System.out.println("it's a Leap year");
        }
        else {
            System.out.println("it's not a Leap year");
        }
    }
}
