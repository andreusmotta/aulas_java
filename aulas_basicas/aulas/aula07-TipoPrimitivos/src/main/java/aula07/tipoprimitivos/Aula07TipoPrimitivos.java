/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package aula07.tipoprimitivos;

/**
 *
 * @author future
 */
public class Aula07TipoPrimitivos {

    public static void main(String[] args) {
        
//        Esses são os jeitos de declarar variáveis com Java:
//        float nota = 8.5f;
//        float nota = (float) 8.5;
//        Float nota = new Float(8.5);

        String nome = "Andreus";
        float nota = 8.5f;
        
      //System.out.print("A nota é " + nota);
        
      //println pula uma linha depois de mostrar o conteúdo. 
        System.out.println("A nota é " + nota);
      
      //printf formata. %.2f coloca duas casas depois da vírgula, o \n garante a quebra de linha.
        System.out.printf("A nota é %.2f \n", nota);
        
        System.out.printf("A nota de %s é %.2f \n", nome, nota);
        
      //format faz a merma bosta que printf:  
        System.out.format("A nota de %s é %.2f \n", nome, nota);
            
    }
}
