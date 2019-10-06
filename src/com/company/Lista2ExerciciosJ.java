package com.company;

import java.util.Scanner;

public class Lista2ExerciciosJ {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media, nota1,nota2,nota3;
        System.out.println("Digite nota");
        nota1 = sc.nextDouble();
        System.out.println("Digite nota");
        nota2 = sc.nextDouble();
        System.out.println("Digite nota");
        nota3 = sc.nextDouble();

        media = nota1+nota2+nota3;

        if ( media <= 3.0) {
            System.out.println("aluno reprovado");
        } else if (media >= 3.1 && media <= 7.0) {
            System.out.println("aluno exame");
        }else
            System.out.println("aluno aprovado");

    }
}
