package com.example.javaexercicios;
import com.example.javaexercicios.Calc;
import com.example.javaexercicios.Triangulo;
import com.example.javaexercicios.Bank;
import com.example.javaexercicios.Calc;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        System.out.println("Desafio de revisão do incrivel professor Alysson!");
        System.out.println("""
                        
                        Atividade:
                        Fazer uma calculadora comum.
                        Banco: Saque e deposito.
                        Triangulo: calculos de triangulo.
                        Menu: O que você está vendo nesse exato momento.
                        """);
        int refazer = 1;
        while (refazer == 1){
            System.out.println("""
                    Escolha uma de nossas funcionalidades:
                    (1) - Calculadora.
                    (2) - Banco.
                    (3) - Area de Triangulo.
                    """);
            int resposta = ler.nextInt();

            if (resposta == 1){
                Calc.calculadora();
            } else if (resposta == 2) {
                Bank.banco();
            } else if (resposta == 3) {
                Triangulo.tring();
            }else{
                System.out.println("Digite um valor valido!");
            }
            System.out.println("Deseja retornar a tela das atividades? (1) Sim - (2) Não");
            refazer = ler.nextInt();
        }
    }
}