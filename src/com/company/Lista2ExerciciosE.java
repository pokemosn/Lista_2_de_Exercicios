package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Lista2ExerciciosE {
    public static void main(String[] args) {
        int a,b,c,scap;
        String mostre = "";

        a = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 1"));
        b = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 2"));
        c = Integer.parseInt(JOptionPane.showInputDialog("Digite o valor 3"));

        if((a>=b)&&(b>=c)) {
            scap = a;
            a = b;
            b = scap;
            JOptionPane.showMessageDialog(null," ordem crescente dos numeros = "+a+" - "+b+" - "+c);
        }
        if((b>=a)&&(a>=c)) {
            scap = b;
            b = a;
            a = scap;
            JOptionPane.showMessageDialog(null," ordem crescente dos numeros = "+b+" - "+a+" - "+c);
        }
        if((c>=a)&&(b>=a)) {
            scap = c;
            c = a;
            a = scap;
            JOptionPane.showMessageDialog(null," ordem crescente dos numeros = "+c+" - "+b+" - "+a);
        }
}}
