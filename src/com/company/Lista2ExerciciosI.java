package com.company;

import java.util.Scanner;

public class Lista2ExerciciosI {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean sexo,masculino = false,feminino = true;
        double altura,peso;
        System.out.println("Digite o sexo");
        sexo = sc.nextBoolean();
        System.out.println("Digite altura");
        altura = sc.nextDouble();

        if (sexo = masculino) {
            peso = 72.7 * altura - 58;
        }else if (sexo = feminino) {
            peso = 62.1 * altura - 44.7;
        }

    }
}
