/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula11b.estruturasderepeticao.contador02;

/**
 *
 * @author future
 */
public class Aula11bEstruturasDeRepeticaoContador02 {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        int contador = 0;
        
        while (contador < 10) {
            contador++;
            // Fazendo assim vai "pular" a cambalhota 5, 7 e 9:
            if (contador == 5 || contador == 7 || contador == 9) {
                continue;
            }
            
            System.out.println("Cambalhota " + contador);
        }
    }
}
