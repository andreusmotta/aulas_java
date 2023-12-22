/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula12bestruturasderepeticaodonumeros;

import java.util.Scanner;

/**
 *
 * @author future
 */
public class Aula12bEstruturasDeRepeticaoDoNumeros {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        int numero, soma = 0;
        String resposta;
        Scanner teclado = new Scanner(System.in);
        
        do {
            System.out.print("Digite um número: ");
            numero = teclado.nextInt();
            soma += numero; //soma = soma + numero;
            System.out.println("Quer continuar? [S/N] ");
            resposta = teclado.next();
        } while (resposta.equals("S"));
        System.out.println("A soma de todos os valores é " + soma);                
    }
}
