package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Hotel:");

        Hotel vect[] = new Hotel[10];
        System.out.print("Quantos quartos vão ser locados?:");
        int n = sc.nextInt();

        for (int i = 1; i <= n; i++) {
            System.out.println("Rent #" + i + ": ");
            System.out.println("Name: ");
            sc.nextLine();
            String name = sc.nextLine();

            System.out.print("Email: ");
            String email = sc.nextLine();

            System.out.println("Quarto: ");
            int quarto = sc.nextInt();

            vect[quarto] = new Hotel(quarto, name, email);
        }

        System.out.println("");
        System.out.println("Quartos Ocupados: ");
        for (int i = 0; i < 10; i++)
            if (vect[i] != null)
                System.out.println(vect[i]);
    }
}