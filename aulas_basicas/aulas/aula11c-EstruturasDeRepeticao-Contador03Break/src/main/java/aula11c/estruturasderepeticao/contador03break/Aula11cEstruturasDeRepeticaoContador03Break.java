/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula11c.estruturasderepeticao.contador03break;

/**
 *
 * @author future
 */
public class Aula11cEstruturasDeRepeticaoContador03Break {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        int contador = 0;
        
        while (contador < 10) {
            contador++;
            // Desse jeito ele vai pular a cambalhota 2, 3 e 5, e vai parar na 6:
            if (contador == 2 || contador == 3 || contador == 4) {
                continue;
            }
            if (contador == 7) {
                break;
            }
            System.out.println("Cambalhota " + contador);
        }
    }
}
