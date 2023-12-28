/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula14b.vetoresmeses;

import java.util.Scanner;

/**
 *
 * @author future
 */
public class Aula14bVetoresMeses {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        String mes[] = {"Jan","Fev","Mar","Abr","Mai","Jun","Jul","Ago","Sep","Out","Nov","Dez"};
        int totB[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        int totNB[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        int anoBis[];
        String bis;
        
        Scanner teclado = new Scanner(System.in);
                       
        System.out.println("Por favor, informe em qual anos estamos: ");
        int anoAtual = teclado.nextInt();
        
        int ano = anoAtual % 4;
        
        if (ano == 0) {            
            anoBis = totB;
            bis = "é bissexto";
        } else {    
            anoBis = totNB;
            bis = "não é bissexto";
        }
                
        System.out.println("O ano de " + anoAtual + " " + bis);
        for (int c = 0; c < mes.length; c++ ) {
            System.out.println("O mês de " + mes[c] + " tem " + anoBis[c] + " dias ao todo.");
        }
    }
}
