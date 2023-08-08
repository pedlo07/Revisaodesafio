package com.example.javaexercicios;

import java.util.Scanner;

public class Calc {
    public static void calculadora(){
        Scanner Cl = new Scanner(System.in);

        System.out.println("Solicite a opsão de calculo");
        System.out.println("""
            1-Soma
            2- Subtração
            3- Multiplicação
            4- Divisão""");

    int opsao = Cl.nextInt();

        System.out.println("Primeiro numero do calculo:");
        double numero1 = Cl.nextDouble();

        System.out.println("Segundo numero do calculo:");
        double numero2 = Cl.nextDouble();

        switch (opsao){
            case 1:
                System.out.println(numero1 + numero2);
            case 2:
                System.out.println(numero1 - numero2);
            case 3:
                System.out.println(numero1 * numero2);
            case 4:
                System.out.println(numero1 / numero2);
        }
    }
}
