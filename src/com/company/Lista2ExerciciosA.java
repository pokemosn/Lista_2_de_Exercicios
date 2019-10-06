package com.company;

import java.util.Scanner;

public class Lista2ExerciciosA {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;
        double preso1 = 0;
        System.out.println("Digite o numero de folhas: ");
        numero = sc.nextInt();
        if (numero<=100) {
            preso1 = 0.25 * numero;
        }else if (numero>=101) {
            preso1 = 0.20 * numero;
        }
        System.out.println("valor total da compra:"+ preso1);

    }
}
