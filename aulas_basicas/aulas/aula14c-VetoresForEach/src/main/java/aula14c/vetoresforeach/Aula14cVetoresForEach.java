/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula14c.vetoresforeach;

import java.util.Arrays;

/**
 *
 * @author future
 */
public class Aula14cVetoresForEach {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        double v[] = {3.5, 2.75, 9, -4.5};
        int i[] = {31,29,31,30,31,30,31,31,30,31,30,31};
        
        for (double valor0: v) {
            System.out.println(valor0 + " ");
        }
        
        System.out.println(""); // Só pra pular linha.
        
        // Agora usando a classe Arrays e o sort pra deixar os valores dentro do vetor em ordem:
        Arrays.sort(v);
        for (double valor1: v) {
            System.out.println(valor1 + " ");
        }
        
        System.out.println(""); // Só pra pular linha.
        
        for (int valor2: i) {
            System.out.println(valor2 + " ");
        }
    }
}
