/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.aula10c.programapernas;

import java.util.Scanner;

/**
 *
 * @author future
 */
public class Aula10cProgramaPernas {

    public static void main(String[] args) {
//        System.out.println("Hello World!");

        System.out.println("Quantas pernas? ");
        Scanner tec = new Scanner(System.in);
        
        int perna = tec.nextInt();
        String tipo;
        
        
        
        System.out.println("Isso é um(a) ");
        switch (perna) {
            case 1:
                tipo = "Saci";
                break;
            case 2:
                tipo = "Bípede";
                break;
            case 3:
                tipo = "Tripé";
                break;
            case 4:
                tipo = "Quadrúpede";
                break;
            case 6:
                tipo = "Aranha";
                break;
            default:
                tipo = "ET";
                break;                
        }
        System.out.println(tipo);
    }
}
