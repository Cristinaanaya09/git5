package com.example;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome " + name + "!");
        scanner.close();
        Date current = new Date();
        
        System.out.println(current);
    }
}