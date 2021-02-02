package com.zup;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random sorteador = new Random();
        int numeroSorteado = sorteador.nextInt(10) + 1;
        int numero;
        int pontuacao = 0;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Jogo da sorte");

        System.out.println("Qual o número (de 1 a 10)?");
        numero = entrada.nextInt();

        if (numero == (numeroSorteado - 1)) {
            pontuacao += 5;
            System.out.println("O número estava um acima do que você tentou.");
        } else if (numero == (numeroSorteado + 1)) {
            pontuacao += 5;
            System.out.println("O número estava um abaixo do que você tentou.");
        } else if (numero == numeroSorteado) {
            pontuacao = 10;
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
        }

        System.out.println("Você obteve " + pontuacao + " pontos.");
    }
}
