package com.example;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String name = scanner.nextLine();
        System.out.println("Welcome to Valladolid" + name + ", come to visit us!" + name);
        scanner.close();
        int b=3;
        Date current = new Date();
        
        System.out.println(current);
    }
}