package com.company;

import java.util.Scanner;

public class Lista2ExerciciosF {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double media,media1, prov1,prov2,prov3,prov4;
        int faltas;

        System.out.println("Digite numero de faltas");
        faltas = sc.nextInt();
        System.out.println("nota 1");
        prov1 =sc.nextDouble();
        System.out.println("nota 2");
        prov2 =sc.nextDouble();
        System.out.println("nota 3");
        prov3 =sc.nextDouble();
        System.out.println("nota 4");
        prov4 =sc.nextDouble();

        media1 = prov1 + prov2 + prov3 + prov4;
        media = media1 / 4;
        if ( faltas > 40) {
            System.out.println("aluno reprovado");

        }else{
            System.out.println("aluno salvo");
        }

        if (media < 6){
            System.out.println("Aluno de recuperação:");

        }else{
            System.out.println("aluno aprovado");
        }
}}
