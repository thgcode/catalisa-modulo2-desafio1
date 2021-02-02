package com.zup;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random sorteador = new Random();
        int numeroSorteado = sorteador.nextInt(10) + 1;
        int numero;
        Scanner entrada = new Scanner(System.in);

        System.out.println("Jogo da sorte");

        System.out.println("Qual o número (de 1 a 10)?");
        numero = entrada.nextInt();

        if (numero == (numeroSorteado - 1)) {
            System.out.println("O número é menor.");
        } else if (numero == (numeroSorteado + 1)) {
            System.out.println("O número é maior.");
        } else if (numero == numeroSorteado) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
        }
    }
}
