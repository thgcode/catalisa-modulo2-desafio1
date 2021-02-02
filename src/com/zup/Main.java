package com.zup;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int pegaInt() {
        return new Scanner(System.in).nextInt();
    }

    static String pegaLinha() {
        return new Scanner(System.in).nextLine();
    }

    public static void main(String[] args) {
        Random sorteador = new Random();
        int numeroSorteado = sorteador.nextInt(10) + 1;
        int numero;
        int pontuacao = 0;
        Scanner entrada = new Scanner(System.in);
        List <Integer> acertos = new ArrayList <>();
        List<Integer> erros = new ArrayList <>();

        System.out.println("Jogo da sorte");

        boolean continuar;

        do {
            System.out.println("Qual o nível de dificuldade que você quer jogar? (de 1 a 3, outro número sai):");
            int nivel = pegaInt();
            int tentativasMax;

            if (nivel == 1) {
                tentativasMax = 5;
            } else if (nivel == 2) {
                tentativasMax = 3;
            } else if (nivel == 3) {
                tentativasMax = 1;
            } else {
                tentativasMax = 0;
            }

            boolean acertou = false;
            for (int tentativa = 0; tentativa < tentativasMax && !acertou; tentativa++) {
                System.out.println("Tentativa " + (tentativa + 1) + " de " + tentativasMax);

                System.out.println("Qual o número (de 1 a 10)?");
                numero = Integer.parseInt(entrada.nextLine());

                if (numero == (numeroSorteado - 1)) {
                    pontuacao += 5;
                    System.out.println("O número estava um acima do que você tentou.");
                } else if (numero == (numeroSorteado + 1)) {
                    pontuacao += 5;
                    System.out.println("O número estava um abaixo do que você tentou.");
                } else if (numero == numeroSorteado) {
                    acertou = true;
                    pontuacao += 10;
                    System.out.println("Você acertou!");
                } else {
                    System.out.println("Você errou.");
                }
            }

            if (!acertou) {
                erros.add(numeroSorteado);
                System.out.println("O número sorteado era " + numeroSorteado);
            } else {
                acertos.add(numeroSorteado);
            }

            System.out.println("Quer jogar de novo? Digite S ou N:");
            continuar = pegaLinha().equalsIgnoreCase("s");
        } while (continuar);

        System.out.println("Você obteve " + pontuacao + " pontos.");
        System.out.println("Você acertou os seguintes números:");
        System.out.println(acertos);
        System.out.println("Você errou os seguintes números:");
        System.out.println(erros);
    }
}
