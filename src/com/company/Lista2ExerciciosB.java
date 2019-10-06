package com.company;

import java.util.Scanner;

public class Lista2ExerciciosB {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double pesasb,pesasr,real;
        System.out.println("Numero de Pessas boas:");
        pesasb = sc.nextInt();
        System.out.println("Numero de Pesas ruins:");
        pesasr = sc.nextInt();

        if (pesasr < pesasb*0.10) {
            System.out.println("não precisa ir para manutemção:");
        }else
            System.out.println("presisa de manutemção");

        }}
