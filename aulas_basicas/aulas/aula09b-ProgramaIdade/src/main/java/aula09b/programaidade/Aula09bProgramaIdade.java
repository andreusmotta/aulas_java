/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula09b.programaidade;

import java.util.Scanner;

/**
 *
 * @author future
 */
public class Aula09bProgramaIdade {

    public static void main(String[] args) {
        // System.out.println("Hello World!");
        
        Scanner teclado = new Scanner(System.in);
                       
        System.out.println("Por favor, informe em qual anos estamos: ");
        int anoAtual = teclado.nextInt();
        
        System.out.println("Por favor, informe seu ano de nascimento: ");
        int nasc = teclado.nextInt();
        
        int i = anoAtual-nasc;
        if (i >= 18) {
            System.out.println("Sua idade é " + i + " e você é MAIOR de idade.");
        } else {
            System.out.println("Sua idade é " + i + " e você é MENOR de idade.");
        }        
    }
}
