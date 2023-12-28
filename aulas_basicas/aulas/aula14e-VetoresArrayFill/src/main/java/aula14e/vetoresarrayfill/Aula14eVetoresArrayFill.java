/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula14e.vetoresarrayfill;

import java.util.Arrays;

/**
 *
 * @author future
 */
public class Aula14eVetoresArrayFill {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        int v[] = new int [20];
        
        Arrays.fill(v, 0);
        
        for (int valor: v) {
            System.out.print(valor + " ");
        }
    }
}
