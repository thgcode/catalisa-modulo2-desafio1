package com.zup;

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Random sorteador = new Random();
        int numeroSorteado = sorteador.nextInt(10) + 1;
        Scanner entrada = new Scanner(System.in);
        boolean continua;
        int numero;

        System.out.println("Jogo da sorte");

        do {
            System.out.println("Qual o número (de 1 a 10)?");
            numero = entrada.nextInt();
            continua = (numero == (numeroSorteado - 1)) || (numero == (numeroSorteado + 1));

            if (continua) {
                if (numeroSorteado < numero) {
                    System.out.println("O número é menor.");
                } else {
                    System.out.println("O número é maior.");
                }
            }
        } while (continua);

        if (numero == numeroSorteado) {
            System.out.println("Você acertou!");
        } else {
            System.out.println("Você errou. O número sorteado era " + numeroSorteado);
        }
    }
}
