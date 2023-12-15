/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula09a.programamedia;

import java.util.Scanner;

/**
 *
 * @author future
 */
public class Aula09aProgramaMedia {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        
        Scanner teclado = new Scanner(System.in);
        
        System.out.println("Por favor, digite a primeira nota: ");
        float n1 = teclado.nextFloat();
        System.out.println("Agora digite a segunda nota, por favor: ");
        float n2 = teclado.nextFloat();
        float m = (n1 + n2)/2;
        
        System.out.println("Sua média foi " + m);
        
        if (m>9) {
            System.out.println("Parabéns, véi!!!");
        }
        
    }
}
