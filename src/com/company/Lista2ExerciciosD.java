package com.company;

import java.util.Scanner;

public class Lista2ExerciciosD {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean ladoa,ladob,ladoc;
        System.out.println("lado a:");
        ladoa = sc.nextBoolean();
        System.out.println("lado b:");
        ladob = sc.nextBoolean();
        System.out.println("lado c");
        ladoc = sc.nextBoolean();
        if (ladoa =! ladob)  (ladoc =! ladob) && (ladoc =! ladoa) {
            System.out.println("escaleno");
        }else if (ladoa = ladob)  (ladoc = ladob) && (ladoc = ladoa){
            System.out.println("equilatero");

        }else{
        System.out.println("escaleno");

        }
}}
