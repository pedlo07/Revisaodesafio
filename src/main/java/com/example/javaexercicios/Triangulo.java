package com.example.javaexercicios;

import java.util.Objects;
import java.util.Scanner;

public class Triangulo {
    public static void tring() {
        Scanner Tri = new Scanner(System.in);
        System.out.println("Codigo para descobrir qual o tipo de seu triangulo!");
        int refazer = 1;
        while (refazer == 1){
            System.out.println("Primeiro Lado:");
            double lado1 = Tri.nextInt();

            System.out.println("Segundo Lado:");
            double lado2 = Tri.nextInt();

            System.out.println("Terceiro Lado:");
            double lado3 = Tri.nextInt();

            if (lado1 == lado2 && lado1 == lado3 && lado2 == lado3) {
                System.out.println("Seu triangulo é Equilátero!");
            } else if ((lado1 == lado2 && lado2 != lado3) ||
                    (lado2 == lado3 && lado3 != lado1) ||
                    (lado3 == lado1 && lado3 != lado2)) {
                System.out.println("Seu triangulo é Isósceles!");
            } else {
                System.out.println("Seu triangulo é Escaleno!");
            }
            System.out.println("Você deseja refazer o teste de triangulo? (1) Sim - (2) Não");
            refazer = Tri.nextInt();
        }
    }
}