/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula14a.vetores;

/**
 *
 * @author future
 */
public class Aula14aVetores {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        // Declaração de valores na variável. Pode ser "int[] n = {3,2,8,7,5,4}" também.
        int n[] = {3,2,8,7,5,4};
        
        // Pra mostrar o que tem na variável tem que usar um laço, não tem outro jeito:
        for (int c=0; c<=5; c++) {
            System.out.println(n[c]);
        }
        
        for (int d=0; d<=5; d++) {
            System.out.print(n[d] + " ");
        }
        
        System.out.println(""); // Só pra pular a linha
        
        for (int e=0; e<=5; e++) {
            System.out.println("Na posição " + e + " temos o valor " + n[e]);
        }
        
        System.out.println("O total de casas de N é " + n.length);
        
        // Usando o stributo length nós pegamos a quantidade de índices do vetor n e já colocamos direto no for.
        for (int f=0; f<=n.length-1; f++){
            System.out.println("Na posição " + f + " temos o valor " + n[f]);
        }
        
    }
}
