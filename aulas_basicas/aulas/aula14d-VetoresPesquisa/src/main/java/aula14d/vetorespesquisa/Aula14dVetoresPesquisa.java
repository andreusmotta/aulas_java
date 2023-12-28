/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula14d.vetorespesquisa;

import java.util.Arrays;

/**
 *
 * @author future
 */
public class Aula14dVetoresPesquisa {

    public static void main(String[] args) {
//        System.out.println("Hello World!");
        
        int vet[] = {3,5,7,9,2,1,0,4};
        
        // Escrevendo os valores na tela:
        for (int valor: vet) {
            System.out.print(valor + " ");
        }
        
        System.out.println(""); // Só pra pular linha.
        
        // Fazendo a pesquisa:
        int pesquisa = Arrays.binarySearch(vet, 9);
                
        System.out.println("Encontrei o valor na posição " + pesquisa);
        
        // Aqui era eu na loucura que não tinha entendido que o searchbinary do arrays entrega a posição do valor procurado:
//        for (int i=0; i<vet.length; i++){
//            int pes = Arrays.binarySearch(vet, i);
//            System.out.println(pes);
//        }
        

        
    }
}
