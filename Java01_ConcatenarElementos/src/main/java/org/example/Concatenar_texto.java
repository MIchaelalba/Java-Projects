package org.example;

public class Concatenar_texto {
    public static void concatenar(){
        System.out.printf("Concatenar texto");

        String nome = "Michael";
        String sobrenome = "Alba";
        int idade = 29;
        double renda = 30000.0;
        System.out.printf("%s %s tem %d anos e ganha R$ %.2f reais%n", nome, sobrenome, idade, renda);
    }
}
