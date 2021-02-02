package com.zup;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Random sorteador = new Random();
        int numeroSorteado = sorteador.nextInt(10) + 1;
        System.out.println(numeroSorteado);
    }
}
