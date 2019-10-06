package com.company;

import java.util.Scanner;

public class Lista2ExerciciosC {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade,infantil,junior,senior;
        System.out.println("Idade do participante");
        idade = sc.nextInt();
        if (idade <= 10) {
            System.out.println("categoria infantil");
        }else if (idade >=11 && idade <=17) {
            System.out.println("categoria junior");
        }else
            System.out.println("categoria senior");{

        }
}}
