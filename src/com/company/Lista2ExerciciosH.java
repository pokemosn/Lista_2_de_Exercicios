package com.company;


import javax.swing.*;

public class Lista2ExerciciosH {

    public static void main(String args[]){

        String saida="";
        String entrada=JOptionPane.showInputDialog("Entre com um numero");

        int i = Integer.parseInt(entrada);

        if(i % 2 == 0)
            saida+="O numero é par";
else
        saida+="O numero é impar";

        JOptionPane.showMessageDialog(null,
                "Valor "+saida,"Testa numero ",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);

    }
}