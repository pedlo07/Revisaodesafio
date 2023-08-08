package com.example.javaexercicios;

import java.util.Scanner;

public class Bank {

    public static void banco() {
        double saldo = 500;
        int repetir = 1;
        Scanner ler = new Scanner(System.in);
        System.out.println("Escreva o nome de sua conta: ");
        String nome = ler.nextLine();
        System.out.println("Usuarios começam com 500 reais de saldo.");
        while (repetir == 1) {
            System.out.println("====" + nome + "====");
            System.out.println("Saldo: " + saldo);
            System.out.println("""
                    =======================
                    (1)depositar
                    (2)sacar
                    (3)sair
                    """);
            int resposta = ler.nextInt();
            if (resposta == 1) {
                System.out.println("Escreva quando deseja depositar: ");
                double deposito = ler.nextDouble();
                saldo = deposito + saldo;
                System.out.println("Saldo atualizado: " + saldo);
                System.out.println("Deseja voltar ao inicio? (1) sim - (2) não");
            }else if (resposta == 2){
                System.out.println("Escreva quando deseja sacar: ");
                double sacar = ler.nextDouble();
                if (saldo > sacar) {
                    saldo = saldo - sacar;
                    System.out.println("Saldo atualizado: " + saldo);
                }else if (saldo < sacar) {
                    System.out.println("Saldo insuficiente!");
                } System.out.println("Deseja voltar ao inicio? (1) sim - (2) não");
            }else if (resposta == 3){
                System.out.println("Confirma que quer sair? (2) sim - (1) não");
            }

            repetir = ler.nextInt();
        }
    }
}
