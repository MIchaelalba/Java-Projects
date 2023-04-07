package org.example;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Define o local como US para usar . no lugar de ,
        Locale.setDefault(Locale.US);

        String nome;
        nome = sc.next();
        System.out.println("Você digitou o nome: " + nome);

        double valor;
        valor = sc.nextDouble();
        System.out.println("Você digitou o valor: " + valor);

        //Inserir duas casas decimais
        System.out.printf("Você digitou o valor: %.2f%n", valor);

        sc.close();

    }
}